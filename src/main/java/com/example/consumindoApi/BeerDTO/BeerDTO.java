package com.example.consumindoApi.BeerDTO;


import java.io.Serializable;

//classe que acessa os dados da API
public class BeerDTO implements Serializable {

    private String name;
    private String description;
    private Long abv;
    private Long ibu;

    public BeerDTO() {

    }

    public BeerDTO(String name, String description, Long abv, Long ibu) {
        this.name = name;
        this.description = description;
        this.abv = abv;
        this.ibu = ibu;
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
