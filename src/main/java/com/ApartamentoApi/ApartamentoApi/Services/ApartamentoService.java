package com.ApartamentoApi.ApartamentoApi.Services;

import java.util.Optional;

import com.ApartamentoApi.ApartamentoApi.Models.Apartamento;
import com.ApartamentoApi.ApartamentoApi.Repository.ApartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartamentoService {
    @Autowired
    private ApartamentoRepository apartamentoRepository;

    public Optional<Apartamento> getApartamentoById(Integer id) {
        return apartamentoRepository.findById(id);
    }


    public Apartamento save(Apartamento apartamento) {
        return apartamentoRepository.save(apartamento);
    }

}