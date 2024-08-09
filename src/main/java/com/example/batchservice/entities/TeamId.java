package com.example.batchservice.entities;

import lombok.*;

import java.io.Serializable;


@Data
public class TeamId implements Serializable {

    private Long teamId;

    private String userId;

    private Long recruitId;

}
