package com.agri.farmers.crops.service.impl;

import com.agri.farmers.crops.entity.Crops;
import com.agri.farmers.crops.entity.CropsCategory;
import com.agri.farmers.crops.repositary.CropsCategoryRepository;
import com.agri.farmers.crops.repositary.CropsRepository;
import com.agri.farmers.crops.service.CropsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<Crops> getSeedsByCategoryId(Long categoryId) {
        return cropsRepository.findByCategoryId(categoryId);
    }
}
