package com.lan.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：zzy
 * @description：TODO
 * @date ：2021/1/2 16:09
 */

@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class HelloConsumer {


    @RabbitHandler
    public void receivel(String message) {

        System.out.println(message);

    }
}
