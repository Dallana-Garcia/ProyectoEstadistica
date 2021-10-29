
package teoremapermutaciones;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Teorema6 extends javax.swing.JFrame {
    TeoremaPermutaciones fondo = new TeoremaPermutaciones ();

    public Teorema6() {
        this.setContentPane(fondo);
        setLocation (255,100);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_n = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_r = new javax.swing.JTextField();
        txt_n1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_r1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_n.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txt_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 40, 50));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel2.setText("(n/r)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel4.setText("_______");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 40));

        txt_r.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txt_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rActionPerformed(evt);
            }
        });
        jPanel1.add(txt_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 40, 50));

        txt_n1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txt_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 40, 50));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel7.setText("(");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 30, 60));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel8.setText(")");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 30, 60));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel9.setText("=");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 23, -1, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel5.setText("-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 20, 50));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel11.setText("!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 60));

        txt_r1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txt_r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_r1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 40, 50));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel12.setText("!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel13.setText("RESULTADO");

        txt_resultado.setBackground(new java.awt.Color(255, 255, 204));
        txt_resultado.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel13)
                .addContainerGap(119, Short.MAX_VALUE))
            .addComponent(txt_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Teorema 6");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMenu.png"))); // NOI18N
        jButton3.setText("Menú");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nActionPerformed

    private void txt_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rActionPerformed

    private void txt_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n1ActionPerformed

    private void txt_r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_r1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu abrir=new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Teorema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_n;
    private javax.swing.JTextField txt_n1;
    private javax.swing.JTextField txt_r;
    private javax.swing.JTextField txt_r1;
    private javax.swing.JLabel txt_resultado;
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
