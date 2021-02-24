package com.example.multimoduleproducer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "consumer", url="http://localhost:8081")
public interface ConsumerClient {

    @GetMapping("/consumer/get")
    String getData();

}
