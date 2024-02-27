package com.bernhard.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "bernhard", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }
}
