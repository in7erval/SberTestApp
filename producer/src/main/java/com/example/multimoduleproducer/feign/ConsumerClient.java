package com.example.multimoduleproducer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@FeignClient(name = "consumer", url="http://localhost:8081")
public interface ConsumerClient {

    @GetMapping("/consumer/get")
    String getData();

    @GetMapping("/consumer/reverse")
    String reverseString(@RequestParam("s") String s);

}
