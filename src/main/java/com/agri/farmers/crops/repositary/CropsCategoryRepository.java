package com.agri.farmers.crops.repositary;

import com.agri.farmers.crops.entity.CropsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropsCategoryRepository extends JpaRepository<CropsCategory, Long> {
}
