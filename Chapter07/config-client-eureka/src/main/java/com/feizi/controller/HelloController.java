/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc HelloController
 * @Author feizi
 * @Date 2016/12/28 13:58
 * @Package_name com.feizi.controller
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public String getFrom(){
        return from;
    }
}
