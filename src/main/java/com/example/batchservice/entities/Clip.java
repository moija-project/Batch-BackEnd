package com.example.batchservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@Table(name = "clip")
@AllArgsConstructor
@NoArgsConstructor
public class Clip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clip_id", nullable = false)
    private Long clipId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "recruit_id", nullable = false)
    private Long recruitId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "recruit_id", referencedColumnName = "recruit_id", insertable = false, updatable = false)
    private Recruit recruit;

}
