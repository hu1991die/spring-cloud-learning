/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Desc 程序主入口
 * @Author feizi
 * @Date 2016/12/26 11:08
 * @Package_name com.feizi
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
