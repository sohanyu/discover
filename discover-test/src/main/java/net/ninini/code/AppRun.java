package net.ninini.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableAutoConfiguration
//@ComponentScan(basePackages = "net.ninini.code")
@ComponentScan
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }
}
