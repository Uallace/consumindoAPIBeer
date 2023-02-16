package com.example.consumindoApi.repository;

import com.example.consumindoApi.model.BeerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<BeerModel,Long> {
    /*@Query(value = "SELECT SUM(abv) FROM BEER_MODEL", nativeQuery = true)
    int somaAbv();*/
}
