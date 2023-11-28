package com.example.MovingMate.repository;

import com.example.MovingMate.Entity.MoveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends JpaRepository<MoveEntity, Long> {
}