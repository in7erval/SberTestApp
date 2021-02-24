package com.example.multimoduleconsumer.controller;

import com.example.multimoduleconsumer.model.Person;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/get")
public class ConsumerController {

    @GetMapping
    public String getData() {
        Person person = Person.builder()
                                .age(10)
                                .name("James")
                                .surname("Brown")
                                .build();
        Gson gson = new Gson();
        return gson.toJson(person);
    }

}
