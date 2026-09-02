package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.nit.collage.College;

@SpringBootApplication
public class SpringBootCollageInformatiomDictionaryMapApplication {

    @Autowired
    private Environment environment;

    @Bean
    public College college() {

        College college = new College();

        college.setName(
                environment.getProperty("college.name")
        );

        Map<String, String> information = new HashMap<>();

        information.put(
                "address",
                environment.getProperty("college.information.address")
        );

        information.put(
                "course",
                environment.getProperty("college.information.course")
        );

        information.put(
                "city",
                environment.getProperty("college.information.city")
        );

        information.put(
                "type",
                environment.getProperty("college.information.type")
        );

        college.setInformation(information);

        return college;
    }

    public static void main(String[] args) {

        var context = SpringApplication.run(
                SpringBootCollageInformatiomDictionaryMapApplication.class,
                args
        );

        College college = context.getBean(College.class);

        System.out.println(college);
    }
}
