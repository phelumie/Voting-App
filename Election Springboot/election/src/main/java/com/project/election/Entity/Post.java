package com.project.election.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

}
