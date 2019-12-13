package com.ApartamentoApi.ApartamentoApi.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

/**
 * Apartamento
 */
@Component
@Entity
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idApartamento;
    private String nombreApartamento;
    @OneToMany(mappedBy = "apartamento")
    @Column(name = "personas")
    private List<Persona> persona;


    /*@Override public String toString() 
    { 
        return "Apartamento [nombreApartamento=" + nombreApartamento +", nombre=" + persona +"]"; 
    }
         + persona.getNombre() +", lastname=" +
    persona.getLastname() +", age=" + persona.getAge() +"]"; }
    */

    /**
     * @return Integer return the idApartamento
     */
    public Integer getIdApartamento() {
        return idApartamento;
    }

    /**
     * @param idApartamento the idApartamento to set
     */
    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    /**
     * @return String return the nombreApartamento
     */
    public String getNombreApartamento() {
        return nombreApartamento;
    }

    /**
     * @param nombreApartamento the nombreApartamento to set
     */
    public void setNombreApartamento(String nombreApartamento) {
        this.nombreApartamento = nombreApartamento;
    }

    /**
     * @return List<Persona> return the persona
     */
    public List<Persona> getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

}