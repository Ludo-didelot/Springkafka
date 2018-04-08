package com.ldt.controller;

import com.ldt.kafka.producer.KafkaProducerLdt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringkafkaController {
	
	@Autowired
	Environment env;
	
	@Autowired
	KafkaProducerLdt producer;

	@RequestMapping(value="/producer", method= RequestMethod.GET)
	public String getResult(@RequestParam("topic") String topic,@RequestParam("input") String value){

			producer.send(topic,value);
		return env.getProperty("message.response");
	}
}
