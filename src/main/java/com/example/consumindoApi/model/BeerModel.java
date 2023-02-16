package com.example.consumindoApi.model;

import com.example.consumindoApi.BeerDTO.BeerDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class BeerModel implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long abv;
    private Long ibu;

    public BeerModel(){

    }

    //faz o mapeamento com a classe DTO
    public BeerModel(BeerDTO beerDTO){
        this.name = beerDTO.getName();
        this.description = beerDTO.getDescription();
        this.abv = beerDTO.getAbv();
        this.ibu = beerDTO.getIbu();
    }


    public BeerModel(Long id, String name, String description, Long abv, Long ibu) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.abv = abv;
        this.ibu = ibu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAbv() {
        return abv;
    }

    public void setAbv(Long abv) {
        this.abv = abv;
    }

    public Long getIbu() {
        return ibu;
    }

    public void setIbu(Long ibu) {
        this.ibu = ibu;
    }

}
