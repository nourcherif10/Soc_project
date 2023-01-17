package com.example.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String firstName;

    private String lastName;

    private String password;

    private String eMail;

    private String birth;

    private String gender;

    private String nameSchool;

}
