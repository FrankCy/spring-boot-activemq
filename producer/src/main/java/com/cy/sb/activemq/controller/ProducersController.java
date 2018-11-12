package com.cy.sb.activemq.controller;

import com.cy.sb.activemq.producers.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-activemq
 * @package: com.cy.sb.activemq.controller
 * @email: cy880708@163.com
 * @date: 2018/11/12 下午8:00
 * @mofified By:
 */
@RestController
@RequestMapping("/producer")
public class ProducersController {

    @Autowired
    Producer producer;

    @RequestMapping("/send")
    public String send() {
        producer.send();
        return "send success";
    }

}
