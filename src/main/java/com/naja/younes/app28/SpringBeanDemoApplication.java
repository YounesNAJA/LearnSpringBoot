package com.naja.younes.app28;

import com.external.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.naja.younes.app28", "com.external"})
@SpringBootApplication
public class SpringBeanDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBeanDemoApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String bean : beanNames) {
            System.out.println(bean);
        }
        System.out.println(ctx.getBean("user").toString());
        System.out.println(ctx.getBean("configurator").toString());
    }

    @Bean
    public User user() {
        return new User("Younes", "NAJA", "naja.younes@gmail.com");
    }
}
