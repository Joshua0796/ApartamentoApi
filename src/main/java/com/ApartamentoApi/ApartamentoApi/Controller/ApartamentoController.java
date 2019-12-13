package com.ApartamentoApi.ApartamentoApi.Controller;

import java.util.Optional;

import com.ApartamentoApi.ApartamentoApi.Models.Apartamento;
import com.ApartamentoApi.ApartamentoApi.Services.ApartamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/apartamento")
public class ApartamentoController {

    @Autowired
    private ApartamentoService apartamentoService;

    @GetMapping
    public Apartamento getApartamento(@RequestParam(name = "id") Integer id){
        Optional<Apartamento> apartamento = apartamentoService.getApartamentoById(id);
        return apartamento.get();

    }


    @PostMapping
    public Apartamento create(@RequestBody Apartamento apartamento){
       return apartamentoService.save(apartamento);

    }


    @PutMapping
    public Apartamento update(@RequestBody Apartamento apartamento){
       return apartamentoService.save(apartamento);

    }

}