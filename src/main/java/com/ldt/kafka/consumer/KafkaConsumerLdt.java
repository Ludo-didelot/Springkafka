package com.ldt.kafka.consumer;



import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by Ludovic on 07/07/2017.
 */
public class KafkaConsumerLdt {


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerLdt.class);
    @KafkaListener(topics = "${kafka.topic}" )
    public void receive(ConsumerRecord<?, ?> record) {

        LOGGER.info("Read Record is : " + record.value());

    }
}