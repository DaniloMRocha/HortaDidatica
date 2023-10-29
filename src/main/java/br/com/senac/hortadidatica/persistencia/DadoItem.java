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
@Table(name="DadoItem")
public class DadoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nomeItem;
    int quantidadeItem;
    double precoItem;
    double precoItemTotal;
    String descricaoItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getPrecoItemTotal() {
        return precoItemTotal;
    }

    public void setPrecoItemTotal(double precoItemTotal) {
        this.precoItemTotal = precoItemTotal;
    }
    
    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    
    
    
}
