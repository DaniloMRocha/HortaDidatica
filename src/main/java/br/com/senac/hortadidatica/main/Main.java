/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.hortadidatica.main;

import br.com.senac.hortadidatica.gui.telaInicial;
import br.com.senac.hortadidatica.persistencia.DAO;
import br.com.senac.hortadidatica.persistencia.DadoPlanta;
import static br.com.senac.hortadidatica.persistencia.ListaInicial.iniciarLista;

/**
 *
 * @author nilu_
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("INICIANDO...");
        
        boolean existemListaPlanta = DAO.existemRegistros(DadoPlanta.class);
        
        if(existemListaPlanta == true){
            System.out.println("Lista inicial já inicializada, abrindo o programa...");
        }else{
            System.out.println("Nenhuma planta foi encontrada, iniciar lista...");
            iniciarLista();
            System.out.println("Lista inicial inicializada, abrindo o programa...");
        }
        
        telaInicial telaInicial = new telaInicial(); 
        telaInicial.setVisible(true);
    }
}
