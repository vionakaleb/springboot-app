package com.squad8.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Employee {
    @Id
    @UuidGenerator

    @Column(name =  "id")
    private String id;

    @Column(name =  "name")
    private String name;

    @Column(name =  "userAd")
    private String userAd;

    @Column(name =  "position")
    private String position;
}
