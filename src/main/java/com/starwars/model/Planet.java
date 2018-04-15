package com.starwars.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@EntityListeners({AuditingEntityListener.class})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long planetId;

    @CreatedDate
    private LocalDateTime created;
    @LastModifiedDate
    private LocalDateTime edited;

    private String name;
    private Integer rotationPeriod;
    private Integer orbitalPeriod;
    private Integer diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private Integer surfaceWater;
    private Long population;
}
