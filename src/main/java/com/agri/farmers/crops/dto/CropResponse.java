package com.agri.farmers.crops.dto;

public class CropResponse {

    private Long id;
    private String name;
    private String description;
    private String image;
    private Long categoryId;
    private String categoryName;

    // ── Constructors ──────────────────────────────
    public CropResponse() {}

    public CropResponse(Long id, String name, String description, String image, Long categoryId, String categoryName) {
        this.id           = id;
        this.name         = name;
        this.description  = description;
        this.image        = image;
        this.categoryId   = categoryId;
        this.categoryName = categoryName;
    }

    // ── Getters ───────────────────────────────────
    public Long getId()             { return id; }
    public String getName()         { return name; }
    public String getDescription()  { return description; }
    public String getImage()        { return image; }
    public Long getCategoryId()     { return categoryId; }
    public String getCategoryName() { return categoryName; }

    // ── Setters ───────────────────────────────────
    public void setId(Long id)                    { this.id = id; }
    public void setName(String name)              { this.name = name; }
    public void setDescription(String description){ this.description = description; }
    public void setImage(String image)            { this.image = image; }
    public void setCategoryId(Long categoryId)    { this.categoryId = categoryId; }
    public void setCategoryName(String categoryName){ this.categoryName = categoryName; }
}