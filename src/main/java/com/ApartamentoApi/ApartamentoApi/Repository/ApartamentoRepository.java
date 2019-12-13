package com.ApartamentoApi.ApartamentoApi.Repository;

import com.ApartamentoApi.ApartamentoApi.Models.Apartamento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ApartamentoRepository extends CrudRepository<Apartamento,Integer> 
    {}
