package br.edu.ifrs.tads.ppa.application.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.edu.ifrs.tads.ppa.application.dto.NewUserEvent;
import br.edu.ifrs.tads.ppa.infrastructure.config.RabbitMQConfig;

@Component
public class NewUserEventListener {

    @RabbitListener(queues = RabbitMQConfig.USER_QUEUE)
    public void newUser(NewUserEvent event) {
        
    }
}