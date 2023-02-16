package com.example.consumindoApi.service;

import com.example.consumindoApi.feingClient.BeerClient;
import com.example.consumindoApi.BeerDTO.BeerDTO;
import com.example.consumindoApi.model.BeerModel;
import com.example.consumindoApi.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeerService {

    @Autowired
    private BeerRepository repo;

    @Autowired
    private BeerClient beerClient;

    public List<BeerDTO> getBeers(){

        return beerClient.getBeers();
    }

    public List<BeerDTO> getRandomBeer(){

        return beerClient.getRandomBeer();
    }

    public List<BeerDTO> getBeerbyId(Long id){

        return beerClient.getBeerById(id);
    }

    //adiciona dados da API no banco de dados
    public List<BeerModel> insert(List<BeerDTO> beers){

        List<BeerModel> beer = new ArrayList<>();

        beer = beers.stream().map(c -> new BeerModel(c)).collect(Collectors.toList());

       /* for(BeerDTO b : beers){
            beer.add(new BeerModel(b));
        }*/

        return repo.saveAll(beer);
    }

}
