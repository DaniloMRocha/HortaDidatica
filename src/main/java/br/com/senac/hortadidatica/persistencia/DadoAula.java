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
@Table(name="DadoAula")
public class DadoAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String tituloAula;
    String tempoAula;
    String materialAula;
    String objetivoAula;
    String procedimentoAula;
    String avaliacaoAula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloAula() {
        return tituloAula;
    }

    public void setTituloAula(String tituloAula) {
        this.tituloAula = tituloAula;
    }

    public String getTempoAula() {
        return tempoAula;
    }

    public void setTempoAula(String tempoAula) {
        this.tempoAula = tempoAula;
    }

    public String getMaterialAula() {
        return materialAula;
    }

    public void setMaterialAula(String materialAula) {
        this.materialAula = materialAula;
    }

    public String getObjetivoAula() {
        return objetivoAula;
    }

    public void setObjetivoAula(String objetivoAula) {
        this.objetivoAula = objetivoAula;
    }

    public String getProcedimentoAula() {
        return procedimentoAula;
    }

    public void setProcedimentoAula(String procedimentoAula) {
        this.procedimentoAula = procedimentoAula;
    }

    public String getAvaliacaoAula() {
        return avaliacaoAula;
    }

    public void setAvaliacaoAula(String avaliacaoAula) {
        this.avaliacaoAula = avaliacaoAula;
    }
    
    
    
    
    
}
