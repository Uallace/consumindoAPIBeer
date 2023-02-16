package com.example.consumindoApi.controller;

import com.example.consumindoApi.BeerDTO.BeerDTO;
import com.example.consumindoApi.repository.BeerRepository;
import com.example.consumindoApi.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerRepository repo;

    @Autowired
    private BeerService service;


    //busca dados da API externa
    @GetMapping()
    public List<BeerDTO> getAllBeers()
    {
        return service.getBeers();
    }

    //salva todas as bebidas da API
    @PostMapping("/salvar")
    @ResponseBody
    public ResponseEntity salvar(@RequestBody List<BeerDTO> beerDto){
        return ResponseEntity.ok(service.insert(beerDto));
    }

    //busca bebidas por id da API externa
    @GetMapping("/{id}")
    public List<BeerDTO> buscarPorId(@PathVariable Long id){

        return service.getBeerbyId(id);
    }

    //busca bebidas aleatorios
    @GetMapping("/random")
    public List<BeerDTO> getRandomBeer(){

        return service.getRandomBeer();
    }

  /* @GetMapping("/somaabv")
    public int somaAbv(){
        return repo.somaAbv();
    }*/
}
