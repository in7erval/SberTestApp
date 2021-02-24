package com.example.multimoduleproducer.controller;

import com.example.multimoduleproducer.feign.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produce")
public class ProducerController {

    private final ConsumerClient consumerClient;

    @Autowired
    public ProducerController(ConsumerClient consumerClient) {
        this.consumerClient = consumerClient;
    }

    @GetMapping
    public String produce() {
        return consumerClient.getData();
    }

}
