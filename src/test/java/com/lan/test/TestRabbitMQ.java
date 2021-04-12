package com.lan.test;

import com.lan.RabbitmqSpringbootApplication;
import org.assertj.core.internal.Classes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：zzy
 * @description：TODO
 * @date ：2021/1/2 16:01
 */

@SpringBootTest(classes = RabbitmqSpringbootApplication.class)
@RunWith(SpringRunner.class)
public class TestRabbitMQ {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    //hello world

    @Test
    public void testFanout() {

        rabbitTemplate.convertAndSend("fanout", "", "fanout message");

    }




    @Test
    public void test1() {

        rabbitTemplate.convertAndSend("hello", "hello world");


    }



}
