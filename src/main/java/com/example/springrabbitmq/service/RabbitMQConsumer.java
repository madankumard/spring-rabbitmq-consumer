package com.example.springrabbitmq.service;

import com.example.springrabbitmq.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "${demo.rabbitmq.queue}")
    public void receivedMessage(Employee employee){
        System.out.println("Received message from rabbitmq: "+ employee);
    }

}
