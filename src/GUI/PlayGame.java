/*...*/

package GUI;

import Auxiliar.Logica;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**...*/
public class PlayGame extends javax.swing.JFrame {

    private Logica log = new Logica(); 
    private boolean caraUp=false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc=false;
           
            public PlayGame() {
        initComponents();
        
        setCards();
          
    }
   private void setCards(){
       int[]numbers = log.getCardsNumbers();
       
       C1.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[0]+".png")));
       C2.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[1]+".png")));
       C3.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[2]+".png")));
       C4.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[3]+".png")));
       C5.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[4]+".png")));
       C6.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[5]+".png")));
       C7.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[6]+".png")));
       C8.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[7]+".png")));
       C9.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[8]+".png")));
       C10.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[9]+".png")));
       C11.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[10]+".png")));
       C12.setDisabledIcon(new ImageIcon(getClass().getResource("../Imagenes/c"+numbers[11]+".png")));
       
   }
   
   private void btnEnable(JButton btn){
       if(caraUp) {
           btn.setEnabled(false);
           im1 = (ImageIcon) btn.getDisabledIcon();
           pbtn[0]=btn;
           caraUp=true;
           primerc=false;
       }
       else {
           btn.setEnabled(false);
           im2 = (ImageIcon) btn.getDisabledIcon();
           pbtn[1] = btn;
           primerc=true;
               
       }   
   }
   
   private void compare(){
       if(caraUp && primerc){
         
           if(im1.getDescription().compareTo(im2.getDescription()) != 0){
               pbtn[0].setEnabled(true);
             pbtn[1].setEnabled(true);
           }       
           caraUp=false;
       }
       
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        C1 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memorama");

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Swis721 BlkOul BT", 1, 24)); // NOI18N
        jLabel1.setText("MEMORAMA ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C1.setToolTipText("");
        C1.setBorder(null);
        C1.setBorderPainted(false);
        C1.setContentAreaFilled(false);
        C1.setFocusable(false);
        C1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C1MouseExited(evt);
            }
        });
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C5.setToolTipText("");
        C5.setBorder(null);
        C5.setBorderPainted(false);
        C5.setContentAreaFilled(false);
        C5.setFocusable(false);
        C5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C5MouseExited(evt);
            }
        });
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C2.setToolTipText("");
        C2.setBorder(null);
        C2.setBorderPainted(false);
        C2.setContentAreaFilled(false);
        C2.setFocusable(false);
        C2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C2MouseExited(evt);
            }
        });
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C6.setToolTipText("");
        C6.setBorder(null);
        C6.setBorderPainted(false);
        C6.setContentAreaFilled(false);
        C6.setFocusable(false);
        C6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C6MouseExited(evt);
            }
        });
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C3.setToolTipText("");
        C3.setBorder(null);
        C3.setBorderPainted(false);
        C3.setContentAreaFilled(false);
        C3.setFocusable(false);
        C3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C3MouseExited(evt);
            }
        });
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C7.setToolTipText("");
        C7.setBorder(null);
        C7.setBorderPainted(false);
        C7.setContentAreaFilled(false);
        C7.setFocusable(false);
        C7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C7MouseExited(evt);
            }
        });
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C4.setToolTipText("");
        C4.setBorder(null);
        C4.setBorderPainted(false);
        C4.setContentAreaFilled(false);
        C4.setFocusable(false);
        C4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C4MouseExited(evt);
            }
        });
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C8.setToolTipText("");
        C8.setBorder(null);
        C8.setBorderPainted(false);
        C8.setContentAreaFilled(false);
        C8.setFocusable(false);
        C8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C8MouseExited(evt);
            }
        });
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C9.setToolTipText("");
        C9.setBorder(null);
        C9.setBorderPainted(false);
        C9.setContentAreaFilled(false);
        C9.setFocusable(false);
        C9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C9MouseExited(evt);
            }
        });
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C10.setToolTipText("");
        C10.setBorder(null);
        C10.setBorderPainted(false);
        C10.setContentAreaFilled(false);
        C10.setFocusable(false);
        C10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C10MouseExited(evt);
            }
        });
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C11.setToolTipText("");
        C11.setBorder(null);
        C11.setBorderPainted(false);
        C11.setContentAreaFilled(false);
        C11.setFocusable(false);
        C11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C11MouseExited(evt);
            }
        });
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista.png"))); // NOI18N
        C12.setToolTipText("");
        C12.setBorder(null);
        C12.setBorderPainted(false);
        C12.setContentAreaFilled(false);
        C12.setFocusable(false);
        C12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vista2.png"))); // NOI18N
        C12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                C12MouseExited(evt);
            }
        });
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C9)
                    .addComponent(C1)
                    .addComponent(C5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C6)
                            .addComponent(C10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C11)
                            .addComponent(C7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C12)
                            .addComponent(C8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3)
                    .addComponent(C4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C5)
                    .addComponent(C6)
                    .addComponent(C7)
                    .addComponent(C8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C9)
                    .addComponent(C10)
                    .addComponent(C11)
                    .addComponent(C12))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setBounds(0, 0, 436, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
       btnEnable(C1);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
       btnEnable(C2);
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
         btnEnable(C3);
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        btnEnable(C4);
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
      btnEnable(C5);
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
      btnEnable(C6);
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
      btnEnable(C7);
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
      btnEnable(C8);
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
      btnEnable(C9);
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
      btnEnable(C10);
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
      btnEnable(C11);
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
         btnEnable(C12);
    }//GEN-LAST:event_C12ActionPerformed

    private void C1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C1MouseExited

    private void C2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C2MouseExited

    private void C3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C3MouseExited

    private void C4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C4MouseExited

    private void C5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C5MouseExited

    private void C6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C6MouseExited

    private void C7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C7MouseExited

    private void C8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C8MouseExited

    private void C9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C9MouseExited

    private void C10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C10MouseExited

    private void C11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C11MouseExited

    private void C12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_C12MouseExited

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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
