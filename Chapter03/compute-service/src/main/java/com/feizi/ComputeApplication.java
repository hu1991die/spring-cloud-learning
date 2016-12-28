/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Desc 程序主入口
 * @Author feizi
 * @Date 2016/12/19 10:22
 * @Package_name com.feizi
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeApplication.class).web(true).run(args);
    }
}
