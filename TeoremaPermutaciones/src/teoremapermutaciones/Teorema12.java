
package teoremapermutaciones;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Teorema12 extends javax.swing.JFrame {
    TeoremaPermutaciones fondo = new TeoremaPermutaciones ();
    
    int a,b,c,d,e,f, resultado,resultado2;

    /**
     * Creates new form Teorema12
     */
    public Teorema12() {
        this.setContentPane(fondo);
        setLocation (255,100);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_resultado1 = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_a1 = new javax.swing.JTextField();
        txt_a2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_a4 = new javax.swing.JTextField();
        txt_a5 = new javax.swing.JTextField();
        txt_a3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Teorema 12");

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMenu.png"))); // NOI18N
        jButton4.setText("Men??");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Resultado");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 26));

        txt_resultado1.setBackground(new java.awt.Color(255, 255, 204));
        txt_resultado1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txt_resultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_resultado1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 40));

        txt_resultado.setBackground(new java.awt.Color(255, 255, 204));
        txt_resultado.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_resultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 50, 40));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel5.setText("________ ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, 80));

        jButton3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrorrar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setText("P(AnB)=");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 80));

        txt_a.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, 40));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("P( ______ )   ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 40));

        txt_a1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 30, 40));

        txt_a2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 30, 40));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel7.setText("P( _____ )     ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 80));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel8.setText("P( ______ )   ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 40));

        txt_a4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 30, 40));

        txt_a5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 30, 40));

        txt_a3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jPanel1.add(txt_a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("P (A1 ??? A2 ??? A3 ) = P (A1) P (A2 | A1) P (A3 | A1 ??? A2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(315, 315, 315)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(41, 41, 41))
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu abrir=new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        a = Integer.parseInt(txt_a.getText());
        b = Integer.parseInt(txt_a1.getText());
        c = Integer.parseInt(txt_a2.getText());
        d = Integer.parseInt(txt_a3.getText());
        e = Integer.parseInt(txt_a4.getText());
        f = Integer.parseInt(txt_a5.getText());
        resultado=(a*b*c);
        resultado2=(d*e*f);
        txt_resultado.setText(String.valueOf(resultado));
        txt_resultado1.setText(String.valueOf(resultado2));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt_a.setText("");
        txt_a1.setText("");
        txt_a2.setText("");
        txt_a3.setText("");
        txt_a4.setText("");
        txt_a5.setText("");
        txt_resultado.setText("");
        txt_resultado1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_a1;
    private javax.swing.JTextField txt_a2;
    private javax.swing.JTextField txt_a3;
    private javax.swing.JTextField txt_a4;
    private javax.swing.JTextField txt_a5;
    private javax.swing.JLabel txt_resultado;
    private javax.swing.JLabel txt_resultado1;
    // End of variables declaration//GEN-END:variables

    class TeoremaPermutaciones extends JPanel {
        //ATRIBUTOS
        private Image Imagen;
        @Override
        //METODOS
        public void paint (Graphics g){
        Imagen = new ImageIcon(getClass().getResource("/Imagenes/fondos.png")).getImage();
        g.drawImage(Imagen, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
        }
    }

}
