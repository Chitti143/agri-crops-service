package com.agri.farmers.crops.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "crop")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Crops {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_crop_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CropsCategory category;

    // ── Constructors ──────────────────────────────
    public Crops() {}

    public Crops(Long id, String name, String description, String image, CropsCategory category) {
        this.id          = id;
        this.name        = name;
        this.description = description;
        this.image       = image;
        this.category    = category;
    }

    // ── Getters ───────────────────────────────────
    public Long getId()                { return id; }
    public String getName()            { return name; }
    public String getDescription()     { return description; }
    public String getImage()           { return image; }
    public CropsCategory getCategory() { return category; }  // ← explicit, no Lombok needed

    // ── Setters ───────────────────────────────────
    public void setId(Long id)                      { this.id = id; }
    public void setName(String name)                { this.name = name; }
    public void setDescription(String description)  { this.description = description; }
    public void setImage(String image)              { this.image = image; }
    public void setCategory(CropsCategory category) { this.category = category; }
}