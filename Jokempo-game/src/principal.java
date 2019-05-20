
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ander
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }
    
    public int mao;
    
    //MAOS
    public void fotoTesoura(){
    ImageIcon foto = new ImageIcon(getClass().getResource("imagens/tesoura-invertida.png"));
    lblSaida.setIcon(foto); 
    }
    
     public void fotoPedra(){
    ImageIcon foto = new ImageIcon(getClass().getResource("imagens/pedra-invertida.png"));
    lblSaida.setIcon(foto); 
    }
     
    public void fotoPapel(){
    ImageIcon foto = new ImageIcon(getClass().getResource("imagens/papel-invertido.png"));
    lblSaida.setIcon(foto); 
    }
    
    //JOGADOR 
    public void jogadorNormal(){
        ImageIcon jogador = new ImageIcon(getClass().getResource("imagens/homem-normal.png"));
        lblJogador.setIcon(jogador);
    }
    
    public void jogadorGanhou(){
        ImageIcon jogador = new ImageIcon(getClass().getResource("imagens/homem-ganhou.png"));
        lblJogador.setIcon(jogador);
    }
    
    public void jogadorPerdeu(){
        ImageIcon jogador = new ImageIcon(getClass().getResource("imagens/homem-perdeu.png"));
        lblJogador.setIcon(jogador);
    }
    
    //MAQUINA
    public void maquinaNormal(){
        ImageIcon maquina = new ImageIcon(getClass().getResource("imagens/mulher-normal.png"));
        lblMaquina.setIcon(maquina);
    }
    
    public void maquinaGanhou(){
        ImageIcon maquina = new ImageIcon(getClass().getResource("imagens/mulher-ganhou.png"));
        lblMaquina.setIcon(maquina);
    }
    
    public void maquinaPerdeu(){
        ImageIcon maquina = new ImageIcon(getClass().getResource("imagens/mulher-perdeu.png"));
        lblMaquina.setIcon(maquina);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblSaidaTexto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblJogador = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblMaquina = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPapel = new javax.swing.JButton();
        btnTesoura = new javax.swing.JButton();
        btnPedra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jokenpo game");
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoJoknepo.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblSaidaTexto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lblSaidaTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/homem-normal.png"))); // NOI18N
        lblJogador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mulher-normal.png"))); // NOI18N
        lblMaquina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblJogador)
                .addGap(30, 30, 30)
                .addComponent(lblSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblMaquina)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tesoura.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedra.png"))); // NOI18N

        btnPapel.setText("PAPEL");
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btnTesoura.setText("TESOURA");
        btnTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesouraActionPerformed(evt);
            }
        });

        btnPedra.setText("PEDRA");
        btnPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnPapel)
                .addGap(158, 158, 158)
                .addComponent(btnTesoura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPedra)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPapel)
                    .addComponent(btnTesoura)
                    .addComponent(btnPedra))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(lblSaidaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSaidaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedraActionPerformed

        double aleatorio = Math.random();

        int aleatorioInteiro = (int) (1 + aleatorio * (3 - 0));

        switch (aleatorioInteiro) {
            case 1:
                fotoPapel();
                lblSaidaTexto.setText("Perdeu!!!!");
                jogadorPerdeu();
                maquinaGanhou();
                break;
            case 2:
                fotoPedra();
                lblSaidaTexto.setText("Empatou!!!!");
                jogadorNormal();
                maquinaNormal();
                break;
            default:
                fotoTesoura();
                lblSaidaTexto.setText("Voce ganhou!!!");
                jogadorGanhou();
                maquinaPerdeu();
                break;
        }
                
    }//GEN-LAST:event_btnPedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        
        double aleatorio = Math.random();

        int aleatorioInteiro = (int) (1 + aleatorio * (3 - 0));

        switch (aleatorioInteiro) {
            case 1:
                fotoPapel();
                lblSaidaTexto.setText("Empate!!!!");
                jogadorNormal();
                maquinaNormal();
                break;
            case 2:
                fotoPedra();
                lblSaidaTexto.setText("Voce Ganhou!!!!");
                jogadorGanhou();
                maquinaPerdeu();
                break;
            default:
                fotoTesoura();
                lblSaidaTexto.setText("Voce perdeu!!!");
                jogadorPerdeu();
                maquinaGanhou();
                break;
        }
        
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesouraActionPerformed
        
        double aleatorio = Math.random();

        int aleatorioInteiro = (int) (1 + aleatorio * (3 - 0));

        switch (aleatorioInteiro) {
            case 1:
                fotoPapel();
                lblSaidaTexto.setText("Voce Ganhou!!!!");
                jogadorGanhou();
                maquinaPerdeu();
                break;
            case 2:
                fotoPedra();
                lblSaidaTexto.setText("Voce Perdeu!!!!");
                jogadorPerdeu();
                maquinaGanhou();
                break;
            default:
                fotoTesoura();
                lblSaidaTexto.setText("Empate!!!");
                jogadorNormal();
                maquinaNormal();
                break;
        }
    }//GEN-LAST:event_btnTesouraActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPedra;
    private javax.swing.JButton btnTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblMaquina;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblSaidaTexto;
    // End of variables declaration//GEN-END:variables
}
