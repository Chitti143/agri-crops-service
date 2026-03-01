package com.agri.farmers.crops.repositary;

import com.agri.farmers.crops.entity.Crops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
@Repository
public interface CropsRepository extends JpaRepository<Crops,Long> {
    List<Crops> findByCategoryId(Long categoryId);

    @Query("SELECT c FROM Crops c JOIN FETCH c.category")
    List<Crops> findAllWithCategory();
}
