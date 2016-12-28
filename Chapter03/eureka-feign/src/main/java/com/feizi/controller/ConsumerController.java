/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.controller;

import com.feizi.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/12/19 16:10
 * @Package_name com.feizi.controller
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10, 20);
    }
}
