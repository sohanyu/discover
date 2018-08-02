package net.ninini.code;

import net.ninini.code.run.CommonRun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "net.ninini.code")
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class AppRun extends CommonRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }
}
