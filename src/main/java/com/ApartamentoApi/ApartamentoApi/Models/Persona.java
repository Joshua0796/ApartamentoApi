package com.ApartamentoApi.ApartamentoApi.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idPersona;
    private String nombre;
    private String lastname;
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "id")
    private Apartamento idApartamento;


    @Override
    public String toString()
    {
        return "Persona [nombre=" + nombre +", lastname=" + lastname +", age=" + age +"]";
    }     

    /**
     * @return Integer return the idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return Apartamento return the idApartamento
     */
    public Apartamento getIdApartamento() {
        return idApartamento;
    }

    /**
     * @param idApartamento the idApartamento to set
     */
    public void setIdApartamento(Apartamento idApartamento) {
        this.idApartamento = idApartamento;
    }

}