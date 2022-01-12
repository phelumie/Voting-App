package com.project.election.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Aspirant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String matricNumber;
    private  String level;
    private  String password;
    private  String imageUrl;
    @ManyToOne(cascade = CascadeType.ALL)
    private Post post;


}
