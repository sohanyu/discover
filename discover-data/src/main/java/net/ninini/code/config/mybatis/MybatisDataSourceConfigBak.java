//package net.ninini.code.mapper.config;
//
//import com.github.pagehelper.PageInterceptor;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.dao.MapperScannerConfigurer;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@MapperScan(basePackages = "net.ninini.code.dao", sqlSessionTemplateRef = "mybatisMasterSqlSessionTemplate")
//@EnableTransactionManagement
//public class MybatisDataSourceConfigBak implements TransactionManagementConfigurer{
//
//
//
//    @Bean(name = "transactionManager")
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean
//    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "mybatisMasterDataSource")
//    @ConfigurationProperties(prefix = "datasource")
//    public DataSource mybatisMasterDataSource() {
////        return new DriverManagerDataSource("jdbc:mysql://localhost:3306/test","root","root");
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "mybatisMasterSqlSessionFactory")
//    public SqlSessionFactory mybatisMasterSqlSessionFactory(@Qualifier("mybatisMasterDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com.mybatis.dao/*.xml"));
//
//        // 设置MyBatis分页插件
//        PageInterceptor pageInterceptor = this.initPageInterceptor();
//        bean.setPlugins(new Interceptor[]{pageInterceptor});
//
//        return bean.getObject();
//    }
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mScannerConfigurer = new MapperScannerConfigurer();
//        mScannerConfigurer.setSqlSessionFactoryBeanName("mybatisMasterSqlSessionFactory");
//        mScannerConfigurer.setBasePackage("com.my.boot.test.entity");
//        mScannerConfigurer.setBasePackage("com.my.boot.test.dao");
//        return mScannerConfigurer;
//    }
//
//
//
//
//
//}
