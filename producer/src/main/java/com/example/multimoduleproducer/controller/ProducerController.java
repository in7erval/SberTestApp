package com.example.multimoduleproducer.controller;

import com.example.multimoduleproducer.feign.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class ProducerController {

    private final ConsumerClient consumerClient;

    @Autowired
    public ProducerController(ConsumerClient consumerClient) {
        this.consumerClient = consumerClient;
    }

    @GetMapping("/api/produce")
    public String produce() {
        return consumerClient.getData();
    }

    @GetMapping("/api/reverse")
    public String reverseString(@RequestParam("s") String s) {
        return consumerClient.reverseString(s);
    }

}
