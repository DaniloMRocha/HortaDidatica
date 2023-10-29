/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.senac.hortadidatica.gui.Horta;

import br.com.senac.hortadidatica.persistencia.DAO;
import br.com.senac.hortadidatica.persistencia.DadoCultivar;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author danilo
 */
public class telaCultivaresHorta extends javax.swing.JFrame {

    /**
     * Creates new form telaCultivaresHorta
     */
    
        //Passo A
    public static final String[] tableColumnsCultivar = {"Nome", "Data", "Coleta"};
    
    //Passo A2
    public static DefaultTableModel tableModelCultivar = new DefaultTableModel(tableColumnsCultivar, 0);
    
    public telaCultivaresHorta() {
        initComponents();
        geraAcessbilidadeCultivar();
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
            iniciaTabelaCultivar();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAcompanharCultivar = new javax.swing.JButton();
        btnExcluirCultivar = new javax.swing.JButton();
        btnVoltarHorta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAdicionarPlanta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCultivar = new javax.swing.JTextField();
        txtDataPlantio = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCultivar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("CULTIVARES DA HORTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu horta"));

        btnAcompanharCultivar.setText("Acompanhar");
        btnAcompanharCultivar.setToolTipText("Clique aqui para acompanhar o cultivo da tabela ao lado - adicionar informações de previsão de coleta e observalções sobre o andamento (Alt + A)");
        btnAcompanharCultivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcompanharCultivarActionPerformed(evt);
            }
        });

        btnExcluirCultivar.setText("Excluir");
        btnExcluirCultivar.setToolTipText("Clique aqui para exluir um dos cultivares da tabela ao lado. Essa função deve ser usada caso a colheita do cultivar já tenha sido colhido ou se tiver morrido (ou se tiver algum erro no preenchimento)(Alt + E)");
        btnExcluirCultivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCultivarActionPerformed(evt);
            }
        });

        btnVoltarHorta.setText("Voltar");
        btnVoltarHorta.setToolTipText("Voltar ao menu de acompanhar horta (Alt + V)");
        btnVoltarHorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarHortaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcompanharCultivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltarHorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAcompanharCultivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCultivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(btnVoltarHorta)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Cultivar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setToolTipText("Quando um novo cultivo for plantado na hora, adicionar ele no sistema aqui");

        btnAdicionarPlanta.setText("Adicionar");
        btnAdicionarPlanta.setToolTipText("Adicionar um novo cultivar que foi plantado (Alt + P)");
        btnAdicionarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPlantaActionPerformed(evt);
            }
        });

        jLabel2.setLabelFor(txtNomeCultivar);
        jLabel2.setText("Nome cultivar:");

        jLabel3.setLabelFor(txtDataPlantio);
        jLabel3.setText("Data de plantio:");

        try {
            txtDataPlantio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCultivar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDataPlantio)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarPlanta)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAdicionarPlanta)
                    .addComponent(txtDataPlantio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblCultivar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data", "Coleta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCultivar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcompanharCultivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcompanharCultivarActionPerformed
        // TODO add your handling code here:
    String posicaoTabelaCultivar = getPosicaoTabelaCultivar();

    if(!posicaoTabelaCultivar.equals("-1")) {
        DadoCultivar cultivarSelecionado = DAO.obterPorId(DadoCultivar.class, posicaoTabelaCultivar);

        telaAcompanharCultivar TelaAcompanharCultivar = new telaAcompanharCultivar();
            
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");
        
        TelaAcompanharCultivar.txtNomeCultivar.setText(cultivarSelecionado.getNomeCultivar());       
        TelaAcompanharCultivar.txtDataPlantio.setText(cultivarSelecionado.getDataPlantio().format(formatter));
        TelaAcompanharCultivar.txtDataColheita.setText(cultivarSelecionado.getDataColheitaDado());
        TelaAcompanharCultivar.txtObsPlantio.setText(cultivarSelecionado.getObsPlantio());
        TelaAcompanharCultivar.txtAcompanhamentoCultivo.setText(cultivarSelecionado.getAcompanhamento());

        TelaAcompanharCultivar.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "Selecione um cultivar!");
    }    
    }//GEN-LAST:event_btnAcompanharCultivarActionPerformed

    private void btnVoltarHortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarHortaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarHortaActionPerformed

    private void btnAdicionarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPlantaActionPerformed
        // TODO add your handling code here:
        if(!campoVazioCultivar()){
            try {
                DadoCultivar cultivar = new DadoCultivar();
                cultivar.setNomeCultivar(txtNomeCultivar.getText());
                cultivar.setDataPlantio(LocalDate.parse(txtDataPlantio.getText(), DateTimeFormatter.ofPattern("dd/MM/y")));
                try{
                    DAO cultivarDao = new DAO();
                    cultivarDao.cadastrar(cultivar);
                    JOptionPane.showMessageDialog(rootPane, "Cultivar cadastrado!");
                    iniciaTabelaCultivar();
                    JOptionPane.showMessageDialog(rootPane, "A tabela de cultivares foi atualizada");

                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Ocorreu um erro ao cadastrar a planta:\n" + e.getMessage());
                }
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(rootPane, "Data inserida no formato inválido.");
            }            
        }   
    }//GEN-LAST:event_btnAdicionarPlantaActionPerformed

    private void btnExcluirCultivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCultivarActionPerformed
        // TODO add your handling code here:
       if(!getPosicaoTabelaCultivar().equals("-1")){
            
            String[] options = { "Sim", "Não" };
            
            int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir as informações desse cultivar?\n(essa ação não pode ser desfeita)", 
                 "Exclusão de cultivar", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
              
            );
            
            if (deletar == 0){
                DAO.excluir(DadoCultivar.class,  getPosicaoTabelaCultivar());
                iniciaTabelaCultivar();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma planta!");
        }
    }//GEN-LAST:event_btnExcluirCultivarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaCultivaresHorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCultivaresHorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCultivaresHorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCultivaresHorta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCultivaresHorta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcompanharCultivar;
    private javax.swing.JButton btnAdicionarPlanta;
    private javax.swing.JButton btnExcluirCultivar;
    private javax.swing.JButton btnVoltarHorta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblCultivar;
    private javax.swing.JFormattedTextField txtDataPlantio;
    private javax.swing.JTextField txtNomeCultivar;
    // End of variables declaration//GEN-END:variables

private boolean campoVazioCultivar(){

    boolean empty = true; 

    if(txtNomeCultivar.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! O nome do cultivar deve ser preenchido!");    
    } else if(txtDataPlantio.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Informar a na qual o cultivar foi plantado!");   
    } else{
         empty = false;
    }
     return empty;    
}

public static String getPosicaoTabelaCultivar() {
    int rowIndex = tblCultivar.getSelectedRow();

    if (rowIndex == -1) {
        return "-1";
    } else {
        return String.valueOf(tblCultivar.getValueAt(rowIndex, 0));
    }
}

public static void iniciaTabelaCultivar(){
    try{
        DAO cultivarDao = new DAO();
        List<DadoCultivar> listaCultivar = cultivarDao.listar(DadoCultivar.class);
        preencheTabelaCultivar(listaCultivar);
    }catch(Exception e){     
        JOptionPane.showMessageDialog(null, "Ocorreu uma falha:\n" + e.getMessage());
    }
}

public static void preencheTabelaCultivar(List<DadoCultivar> listaCultivar){
    String columns[] = {"Id", "Nome", "Data", "Coleta"};
    String dados[][] = new String[listaCultivar.size()][columns.length];
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");
    int i=0;
    for(DadoCultivar d: listaCultivar){
        dados[i] = new String[]{
            String.valueOf(d.getId()),
            d.getNomeCultivar(),
            d.getDataPlantio().format(formatter),
            d.getDataColheitaDado(),};
        i++;
        }
    DefaultTableModel tabelaCultivar = new DefaultTableModel(dados, columns);
    tblCultivar.setModel(tabelaCultivar);
    TableColumnModel columnModel = tblCultivar.getColumnModel();//essa linha e as próximas escondem a coluna id para a tabela ficar visualmente melhor
    columnModel.getColumn(0).setMinWidth(0);
    columnModel.getColumn(0).setMaxWidth(0);
    columnModel.getColumn(0).setWidth(0);
}

public void geraAcessbilidadeCultivar(){

btnAcompanharCultivar.setMnemonic(KeyEvent.VK_A);
btnExcluirCultivar.setMnemonic(KeyEvent.VK_E);
btnAdicionarPlanta.setMnemonic(KeyEvent.VK_P);
    
}
}
