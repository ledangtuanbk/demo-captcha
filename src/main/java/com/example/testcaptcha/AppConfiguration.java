package com.example.testcaptcha;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class AppConfiguration {

    @Bean
    public Producer getProducer(){
        Properties properties = new Properties();
//        properties.put("kaptcha.border", "yes");
//        properties.put("kaptcha.border.color", "105,179,90");
//        properties.put("kaptcha.textproducer.font.color", "red");
//        properties.put("kaptcha.image.width", "125");
//        properties.put("kaptcha.image.height", "45");
//        properties.put("kaptcha.textproducer.font.size", "45");
//        properties.put("kaptcha.session.key", "code");
//        properties.put("kaptcha.textproducer.char.length", "4");
//        properties.put("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        properties.put("kaptcha.border", "no");
        properties.put("kaptcha.textproducer.font.color", "black");
        properties.put("kaptcha.textproducer.char.space", "5");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
