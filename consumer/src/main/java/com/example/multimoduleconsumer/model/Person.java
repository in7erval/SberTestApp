package com.example.multimoduleconsumer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String name;
    private String surname;
    private Integer age;

}
