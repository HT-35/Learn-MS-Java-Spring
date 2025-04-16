package com.example.service_b.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "service-b")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Service B received: " + record.value());
    }
}
