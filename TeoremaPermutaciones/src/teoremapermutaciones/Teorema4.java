
package teoremapermutaciones;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Teorema4 extends javax.swing.JFrame {
     TeoremaPermutaciones fondo = new TeoremaPermutaciones ();
    
    private double a, b, c,valor1, valor2;

    public Teorema4() {
        this.setContentPane(fondo);
        setLocation (255,100);
        initComponents();
        txtResultado.setBackground(new Color (0,0,0,0));
        txtResultado1.setBackground(new Color (0,0,0,0));
        txtResultado2.setBackground(new Color (0,0,0,0));
        txtResultado3.setBackground(new Color (0,0,0,0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        numero4 = new javax.swing.JTextField();
        numero3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        Factorial1 = new javax.swing.JButton();
        txtResultado1 = new javax.swing.JTextField();
        txtResultado2 = new javax.swing.JTextField();
        txtResultado3 = new javax.swing.JTextField();
        Factorial2 = new javax.swing.JButton();
        Factorial3 = new javax.swing.JButton();
        Factorial4 = new javax.swing.JButton();
        txtResultadoPrincipal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText(" !");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Teorema 4");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("n1!   n2!  ... nk!");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel3.setText("________________________________");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("n !");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel5.setText("_______________________________________________________________________________");

        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrorrar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        Factorial1.setText("!");
        Factorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factorial1ActionPerformed(evt);
            }
        });

        txtResultado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtResultado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtResultado3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtResultado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado3ActionPerformed(evt);
            }
        });

        Factorial2.setText("!");
        Factorial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factorial2ActionPerformed(evt);
            }
        });

        Factorial3.setText("!");
        Factorial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factorial3ActionPerformed(evt);
            }
        });

        Factorial4.setText("!");
        Factorial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factorial4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMenu.png"))); // NOI18N
        jButton3.setText("Menú");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("=");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel8.setText("_________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Factorial3)
                                .addGap(12, 12, 12)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Factorial2)
                                .addGap(7, 7, 7)
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Factorial4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Factorial1)
                        .addGap(223, 223, 223)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtResultadoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel4))))
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Factorial1)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Factorial4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Factorial2)
                                .addComponent(Factorial3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(txtResultadoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed

    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtResultado.setText("");
        txtResultado1.setText("");
        txtResultado2.setText("");
        txtResultado3.setText("");
        txtResultadoPrincipal.setText("");
        numero1.setText("");
        numero2.setText("");
        numero3.setText("");
        numero4.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double valor1 = Double.parseDouble(txtResultado.getText());
        double num2 = Double.parseDouble(txtResultado1.getText());
        double num3 = Double.parseDouble(txtResultado2.getText());
        double num4 = Double.parseDouble(txtResultado3.getText());
        
        txtResultadoPrincipal.setText(String.valueOf(valor1/(num2*num3*num4)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Factorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factorial1ActionPerformed
        a = 1;
        valor1= Double.parseDouble( numero1.getText());
        //valor1= Double.parseDouble( numero2.getText());
        txtResultado.setText("fact (" +valor1+ ")");
        
        for(b =1; b<=valor1; b++) {
        a = a*b;
        }
        txtResultado.setText(a + " ");
    }//GEN-LAST:event_Factorial1ActionPerformed

    private void Factorial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factorial2ActionPerformed
        a = 1;
        valor1= Double.parseDouble( numero3.getText());
        txtResultado2.setText("fact (" +valor1+ ")");
        
        for(b =1; b<=valor1; b++) {
        a = a*b;
        }
        txtResultado2.setText(a + " ");
    }//GEN-LAST:event_Factorial2ActionPerformed

    private void Factorial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factorial3ActionPerformed
        a = 1;
        valor1= Double.parseDouble( numero2.getText());
        txtResultado1.setText("fact (" +valor1+ ")");
        
        for(b =1; b<=valor1; b++) {
        a = a*b;
        }
        txtResultado1.setText(a + " ");
    }//GEN-LAST:event_Factorial3ActionPerformed

    private void Factorial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factorial4ActionPerformed
        a = 1;
        valor1= Double.parseDouble( numero4.getText());
        txtResultado3.setText("fact (" +valor1+ ")");
        
        for(b =1; b<=valor1; b++) {
        a = a*b;
        }
        txtResultado3.setText(a + " ");
    }//GEN-LAST:event_Factorial4ActionPerformed

    private void txtResultado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado3ActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Factorial1;
    private javax.swing.JButton Factorial2;
    private javax.swing.JButton Factorial3;
    private javax.swing.JButton Factorial4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField numero3;
    private javax.swing.JTextField numero4;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultado1;
    private javax.swing.JTextField txtResultado2;
    private javax.swing.JTextField txtResultado3;
    private javax.swing.JTextField txtResultadoPrincipal;
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
