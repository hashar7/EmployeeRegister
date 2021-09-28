package com.emp_register.springboot.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.emp_register.springboot.demoapp.entity",
        "com.emp_register.springboot.demoapp.service",
        "com.emp_register.springboot.demoapp.repo",
        "com.emp_register.springboot.demoapp.controller"},
        exclude = JpaRepositoriesAutoConfiguration.class)
@EnableTransactionManagement
@EnableJpaRepositories("com.emp_register.springboot.demoapp.repo")
public class DemoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.emp_register.springboot.demoapp.entity.DemoappApplication.class, args);
    }

}
