package com.karad.k8s.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}