package com.xdavide9.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amigoscode",
            groupId = "groupId"     // to consume from different partitions specify the same groupId
    )
    void listener(String message) {
        System.out.println("Listener received " + message);
    }
}
