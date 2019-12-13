package com.ApartamentoApi.ApartamentoApi;

import java.util.ArrayList;
import java.util.List;

import com.ApartamentoApi.ApartamentoApi.Models.Apartamento;
import com.ApartamentoApi.ApartamentoApi.Models.Persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {  
  
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		// INSERTAR Y GUARDAR
		List<Persona> perlist = new ArrayList<Persona>();
		Persona per = new Persona();
		// 1
		per.setNombre("Juan");
		per.setLastname("Garcias");
		per.setAge(10);
		// 2
		per.setNombre("Maria");
		per.setLastname("Pena");
		per.setAge(33);
		// 3
		per.setNombre("Maite");
		per.setLastname("Duran");
		per.setAge(22);
		
		// INSERTA LISTA PERSONA
		perlist.add(per);

		// INSERTA LISTA APARTAMENTOS
		Apartamento apa = new Apartamento();
		apa.setNombreApartamento("AXI"); 

		
	}

}
