package com.saad.deployment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;
}
