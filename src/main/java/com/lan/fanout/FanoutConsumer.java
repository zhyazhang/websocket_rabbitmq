package com.lan.fanout;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：zzy
 * @description：TODO
 * @date ：2021/1/2 16:25
 */

@Component
public class FanoutConsumer {

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "fanout", type = "fanout")
            )
    })
    public void test1(String message) {

        System.out.println(message);

    }


    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "fanout", type = "fanout")
            )
    })
    public void test2(String message) {

        System.out.println(message);

    }
}
