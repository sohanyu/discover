package net.ninini.code.config.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.github.pagehelper.PageInterceptor;
import net.ninini.code.constant.MybatisCons;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

//@MapperScan(basePackages = "net.ninini.code.dao", sqlSessionTemplateRef = "mybatisMasterSqlSessionTemplate")
@Configuration
@EnableTransactionManagement
public class MybatisDataSourceConfig implements TransactionManagementConfigurer {

    private Logger logger = LoggerFactory.getLogger(MybatisDataSourceConfig.class);

    @Resource(name = "dataSource")
    DataSource dataSource;

    @Bean(name = "transactionManager")
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory mybatisMasterSqlSessionFactory() throws Exception {

        VFS.addImplClass(SpringBootVFS.class);

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setVfs(SpringBootVFS.class);
        PageInterceptor pageInterceptor = this.initPageInterceptor();
        bean.setPlugins(new Interceptor[]{pageInterceptor});
        bean.setTypeAliasesPackage(MybatisCons.MYBATIS_TYPE_ALIASES_PACKAGE);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(configuration);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MybatisCons.MYBATIS_MAPPER_XML_PACKAGE));
        return bean.getObject();
    }

    @Bean(name = "mybatisMasterSqlSessionTemplate")
    public SqlSessionTemplate mybatisMasterSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PageInterceptor initPageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }

    //@Bean(name = "mybatisMasterDataSource")
    //@ConfigurationProperties(prefix = "datasource")
    //public DataSource mybatisMasterDataSource() {
    //return new DriverManagerDataSource("jdbc:mysql://localhost:3306/test","root","root");
    //return DataSourceBuilder.create().build();
    //}

    //@Bean(name = "mybatisMasterTransactionManager")
    //public DataSourceTransactionManager mybatisMasterTransactionManager() {
    //return new DataSourceTransactionManager(dataSource);
    //}


}
