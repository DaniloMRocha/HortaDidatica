
import br.com.senac.hortadidatica.persistencia.DAO;
import br.com.senac.hortadidatica.persistencia.DadoPlanta;
import static br.com.senac.hortadidatica.persistencia.ListaInicial.iniciarLista;

public class Main {
    
        public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    System.out.println("INICIANDO...");
        
                    boolean existemListaPlanta = DAO.existemRegistros(DadoPlanta.class);
        
                    if(existemListaPlanta == true){
                        System.out.println("Lista inicial já inicializada, abrindo o programa...");
                    }else{
                        System.out.println("Nenhuma planta foi encontrada, iniciar lista...");
                        iniciarLista();
                        System.out.println("Lista inicial inicializada, abrindo o programa...");
                    }
                    
                    new br.com.senac.hortadidatica.gui.telaInicial().setVisible(true);
                }
                });
            }
                     
    
}
