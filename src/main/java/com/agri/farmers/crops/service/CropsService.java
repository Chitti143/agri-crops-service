package com.agri.farmers.crops.service;

import com.agri.farmers.crops.entity.Crops;
import com.agri.farmers.crops.entity.CropsCategory;

import java.util.List;

public interface CropsService {
    List<CropsCategory> getAllCategories();

    List<Crops> getSeedsByCategoryId(Long categoryId);
}
