package com.example.springtest.repositories;

import com.example.springtest.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

}

