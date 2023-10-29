/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.hortadidatica.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="DadoCultivar")
public class DadoCultivar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String nomeCultivar;
    LocalDate dataPlantio;
    LocalDate dataColheitaPrevisto;
    String dataColheitaDado;
    String obsPlantio;
    String acompanhamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeCultivar() {
        return nomeCultivar;
    }

    public void setNomeCultivar(String nomeCultivar) {
        this.nomeCultivar = nomeCultivar;
    }

    public LocalDate getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(LocalDate dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public LocalDate getDataColheitaPrevisto() {
        return dataColheitaPrevisto;
    }

    public void setDataColheitaPrevisto(LocalDate dataColheitaPrevisto) {
        this.dataColheitaPrevisto = dataColheitaPrevisto;
    }

    public String getDataColheitaDado() {
        return dataColheitaDado;
    }

    public void setDataColheitaDado(String dataColheitaDado) {
        this.dataColheitaDado = dataColheitaDado;
    }

    public String getObsPlantio() {
        return obsPlantio;
    }

    public void setObsPlantio(String obsPlantio) {
        this.obsPlantio = obsPlantio;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    
    
    
}
