package com.example.Student.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    int id;
    String name;
    String surname;
    String city;
    String phoneNumber;

}
