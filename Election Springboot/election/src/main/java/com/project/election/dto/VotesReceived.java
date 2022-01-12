package com.project.election.dto;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Votes")
public class VotesReceived {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nullable
    private String president;
    @Nullable
    private String vicePresident;
    @Nullable
    private String generalSecretary;
    @Nullable
    private String pro;
    @Nullable
    private String sportDirector;

}
