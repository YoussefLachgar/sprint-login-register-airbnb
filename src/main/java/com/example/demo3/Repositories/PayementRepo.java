package com.example.demo3.Repositories;

import com.example.demo3.Entities.PayementEntity.PayementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PayementRepo extends JpaRepository<PayementEntity,Long> {
}
