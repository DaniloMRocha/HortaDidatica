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

@Entity
@Table(name="DadoPlanta")
public class DadoPlanta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String nomePlanta;
    String familiaPlanta;
    String epocaPlanta;
    int tempoPlanta;
    String irrigacaoPlanta;
    String iluminacaoPlanta;
    String nutricionalPlanta;
    String observacoesCultivo;
    String nomeCientifico;
    String didatico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    public String getFamiliaPlanta() {
        return familiaPlanta;
    }

    public void setFamiliaPlanta(String familiaPlanta) {
        this.familiaPlanta = familiaPlanta;
    }

    public String getEpocaPlanta() {
        return epocaPlanta;
    }

    public void setEpocaPlanta(String epocaPlanta) {
        this.epocaPlanta = epocaPlanta;
    }

    public int getTempoPlanta() {
        return tempoPlanta;
    }

    public void setTempoPlanta(int tempoPlanta) {
        this.tempoPlanta = tempoPlanta;
    }

    public String getIrrigacaoPlanta() {
        return irrigacaoPlanta;
    }

    public void setIrrigacaoPlanta(String irrigacaoPlanta) {
        this.irrigacaoPlanta = irrigacaoPlanta;
    }

    public String getIluminacaoPlanta() {
        return iluminacaoPlanta;
    }

    public void setIluminacaoPlanta(String iluminacaoPlanta) {
        this.iluminacaoPlanta = iluminacaoPlanta;
    }

    public String getNutricionalPlanta() {
        return nutricionalPlanta;
    }

    public void setNutricionalPlanta(String nutricionalPlanta) {
        this.nutricionalPlanta = nutricionalPlanta;
    }

    public String getObservacoesCultivo() {
        return observacoesCultivo;
    }

    public void setObservacoesCultivo(String observacoesPlanta) {
        this.observacoesCultivo = observacoesPlanta;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getDidatico() {
        return didatico;
    }

    public void setDidatico(String Didatico) {
        this.didatico = Didatico;
    }
  
}
