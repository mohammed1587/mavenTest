package com.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @AllArgsConstructor @NoArgsConstructor @Data @Builder
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastNAme;
    private String email;
}
