package com.example.multimoduleconsumer.controller;

import com.example.multimoduleconsumer.model.Person;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class ConsumerController {

    private final Gson gson = new Gson();

    @GetMapping("/consumer/get")
    public String getData() {
        Person person = Person.builder()
                                .age(10)
                                .name("James")
                                .surname("Brown")
                                .birthday(LocalDateTime.now())
                                .build();

        return gson.toJson(person);
    }

    @GetMapping("/consumer/reverse")
    public String reverseString(@RequestParam("s") String s) {
        JsonObject object = new JsonObject();
        object.addProperty("before", s);
        object.addProperty("after", (new StringBuilder(s)).reverse().toString());
        return gson.toJson(object);
    }

}
