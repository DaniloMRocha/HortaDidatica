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
@Table(name="DadoUsuario")
public class DadoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nomeUsuario;
    String posicaoUsuario;
    String chapaUsuario;
    String setorUsuario;
    String senhaUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPosicaoUsuario() {
        return posicaoUsuario;
    }

    public void setPosicaoUsuario(String posicaoUsuario) {
        this.posicaoUsuario = posicaoUsuario;
    }

    public String getChapaUsuario() {
        return chapaUsuario;
    }

    public void setChapaUsuario(String idUsuario) {
        this.chapaUsuario = idUsuario;
    }

    public String getSetorUsuario() {
        return setorUsuario;
    }

    public void setSetorUsuario(String setorUsuario) {
        this.setorUsuario = setorUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
    
    
    
}
