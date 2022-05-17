package com.leozeballos.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "leo-topic", groupId = "leo-group")
    void listener(String data) {
        System.out.println("(i) Received: " + data);
    }

}
