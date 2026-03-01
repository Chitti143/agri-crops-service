package com.agri.farmers.crops.service.impl;

import com.agri.farmers.crops.dto.CropResponse;
import com.agri.farmers.crops.entity.CropsCategory;
import com.agri.farmers.crops.repositary.CropsCategoryRepository;
import com.agri.farmers.crops.repositary.CropsRepository;
import com.agri.farmers.crops.service.CropsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CropsServiceImpl implements CropsService {

    @Autowired
    private CropsRepository cropsRepository;

    @Autowired
    private CropsCategoryRepository cropsCategoryRepository;

    @Override
    public List<CropsCategory> getAllCategories() {
        return cropsCategoryRepository.findAll();
    }

    @Override
    public List<CropResponse> getCropsByCategoryId(Long categoryId) {
        return cropsRepository.findByCategoryId(categoryId)
                .stream()
                .map(crop -> new CropResponse(
                        crop.getId(),
                        crop.getName(),
                        crop.getDescription(),
                        crop.getImage(),
                        crop.getCategory().getId(),       // ✅ works now
                        crop.getCategory().getName()      // ✅ works now
                ))
                .collect(Collectors.toList());
    }

    @Override
    public List<CropResponse> getAllCrops() {
        Map<Long, String> categoryMap = cropsCategoryRepository.findAll()
                .stream()
                .collect(Collectors.toMap(
                        CropsCategory::getId,
                        CropsCategory::getName
                ));
        return cropsRepository.findAllWithCategory()
                .stream()
                .map(crop -> new CropResponse(
                        crop.getId(),
                        crop.getName(),
                        crop.getDescription(),
                        crop.getImage(),
                        crop.getCategory().getId(),
                        categoryMap.getOrDefault(crop.getCategory().getId(), "Unknown")
                ))
                .collect(Collectors.toList());
    }
}