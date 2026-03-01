package com.agri.farmers.crops.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "crop_category")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CropsCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // ── Constructors ──────────────────────────────
    public CropsCategory() {}

    public CropsCategory(Long id, String name) {
        this.id   = id;
        this.name = name;
    }

    // ── Getters ───────────────────────────────────
    public Long getId()     { return id; }
    public String getName() { return name; }

    // ── Setters ───────────────────────────────────
    public void setId(Long id)        { this.id = id; }
    public void setName(String name)  { this.name = name; }
}