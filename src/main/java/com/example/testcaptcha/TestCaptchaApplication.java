package com.example.testcaptcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:spring-captcha.xml")
public class TestCaptchaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCaptchaApplication.class, args);
    }

}
