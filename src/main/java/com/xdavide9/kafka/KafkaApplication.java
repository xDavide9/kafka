package com.xdavide9.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    // kafka can easily handle billions of messages
    // bin/kafka-console-consumer.sh --topic amigoscode --from-beginning --bootstrap-server localhost:9092
    // to view the messages
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate) {
        return args -> {
            for (int i = 1; i <= 100; i++)
                kafkaTemplate.send("amigoscode",
                        new Message("Hello World " + i, LocalDateTime.now()));
        };
    }

}
