package com.example.multimoduleconsumer.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Person {

    private String name;
    private String surname;
    private Integer age;
    private LocalDateTime birthday;

}
