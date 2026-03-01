package com.agri.farmers.crops.controller;

import com.agri.farmers.crops.dto.CropResponse;
import com.agri.farmers.crops.entity.Crops;
import com.agri.farmers.crops.entity.CropsCategory;
import com.agri.farmers.crops.service.CropsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/crops")
public class CropsController {
    @Autowired
    private CropsService cropsService;

    @GetMapping
    public ResponseEntity<List<CropResponse>> getAllCrops() {
        return ResponseEntity.ok(cropsService.getAllCrops());
    }

    @GetMapping("/category")
    public List<CropsCategory> getAllCategories() {
        return cropsService.getAllCategories();
    }

    @GetMapping("/category/{categoryId}")
    public List<CropResponse> getCropsByCategoryId(@PathVariable Long categoryId) {
        return cropsService.getCropsByCategoryId(categoryId);
    }
}
