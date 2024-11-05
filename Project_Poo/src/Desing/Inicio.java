/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Desing;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author leona
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setButtonImage(btnEstudiante, "src/Image/Alumno.png");
        setButtonImage(btnEntrenador, "src/Image/EntrenadorLogo.png");
    }
    private void setButtonImage(JButton button, String imagePath) {
        
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Icon icon = new ImageIcon(imageIcon.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH));
        button.setIcon(icon);
      
        //button.setBorderPainted(false);
        //button.setContentAreaFilled(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnEstudiante = new javax.swing.JButton();
        btnEntrenador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/EscudoCDT.jpg"))); // NOI18N
        lblLogo.setText("jLabel1");

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(0, 0, 0));
        lblMensaje.setText("Ingrese como: ");

        btnEstudiante.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Project-Academy\\ProjectPoo\\Project_Poo\\src\\Image\\Alumno.png")); // NOI18N
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        btnEntrenador.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\Documents\\Project-Academy\\ProjectPoo\\Project_Poo\\src\\Image\\EntrenadorLogo.png")); // NOI18N
        btnEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMensaje)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblMensaje)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        // TODO add your handling code here:
        StudentLogin stLogin = new StudentLogin();
        stLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadorActionPerformed
        // TODO add your handling code here:
        CoachLogin cLogin = new CoachLogin();
        cLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnEntrenadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrenador;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
