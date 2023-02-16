package com.example.consumindoApi.feingClient;

import com.example.consumindoApi.BeerDTO.BeerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//interface de comunicacao com a API externa
@FeignClient(name = "BeerClient", url = "https://api.punkapi.com/v2/beers")
public interface BeerClient {

    @GetMapping()
    List<BeerDTO> getBeers();

    @GetMapping(value = "/random")
    List<BeerDTO> getRandomBeer();

    @GetMapping(value = "/{id}")
    List<BeerDTO> getBeerById(@PathVariable("id") Long id);
}
