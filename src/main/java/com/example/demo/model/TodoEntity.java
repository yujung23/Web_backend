package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Entity
@Table(name="Todo")

public class TodoEntity {
    private String id;
    private String userId;
    private String title;
    private boolean done;
}
