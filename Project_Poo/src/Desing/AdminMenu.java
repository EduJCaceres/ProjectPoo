/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Desing;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
        setLocationRelativeTo(this);
      
      
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        miAgregarAlumno = new javax.swing.JMenuItem();
        miConsultarAlumno = new javax.swing.JMenuItem();
        miListarAlumno = new javax.swing.JMenuItem();
        menuDocente = new javax.swing.JMenu();
        miConsultarEntrenador = new javax.swing.JMenuItem();
        miListarEntrenador = new javax.swing.JMenuItem();
        menuCurso = new javax.swing.JMenu();
        miAgregarCurso = new javax.swing.JMenuItem();
        miListarCurso = new javax.swing.JMenuItem();
        menuMatricula = new javax.swing.JMenu();
        miAgregarMatricula = new javax.swing.JMenuItem();
        menuHorarios = new javax.swing.JMenu();
        miAgregarHorario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 61, 89));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/EscudoCDT.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("<html>\nBienvenido\n<Admin>\nAdmin");

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/return.jpg"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        menuAlumno.setText("Alumnos");

        miAgregarAlumno.setText("Agregar");
        miAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(miAgregarAlumno);

        miConsultarAlumno.setText("Consultar");
        miConsultarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(miConsultarAlumno);

        miListarAlumno.setText("Listar");
        miListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(miListarAlumno);

        barraMenu.add(menuAlumno);

        menuDocente.setText("Docentes");

        miConsultarEntrenador.setText("Consultar");
        miConsultarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarEntrenadorActionPerformed(evt);
            }
        });
        menuDocente.add(miConsultarEntrenador);

        miListarEntrenador.setText("Listar");
        miListarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarEntrenadorActionPerformed(evt);
            }
        });
        menuDocente.add(miListarEntrenador);

        barraMenu.add(menuDocente);

        menuCurso.setText("Cursos");

        miAgregarCurso.setText("Agregar");
        menuCurso.add(miAgregarCurso);

        miListarCurso.setText("Listar");
        menuCurso.add(miListarCurso);

        barraMenu.add(menuCurso);

        menuMatricula.setText("Matrículas");

        miAgregarMatricula.setText("Agregar");
        menuMatricula.add(miAgregarMatricula);

        barraMenu.add(menuMatricula);

        menuHorarios.setText("Horarios");

        miAgregarHorario.setText("Agregar");
        menuHorarios.add(miAgregarHorario);

        barraMenu.add(menuHorarios);

        jMenu6.setText("Salir");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu6.add(miSalir);

        barraMenu.add(jMenu6);

        setJMenuBar(barraMenu);

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

    private void miListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarAlumnoActionPerformed
        // TODO add your handling code here:
        AdminListarAlumno listarAlumno = new AdminListarAlumno();
        listarAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miListarAlumnoActionPerformed

    private void miAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        AdminAgregarAlumno agregarAlumno = new AdminAgregarAlumno();
        agregarAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miAgregarAlumnoActionPerformed

    private void miConsultarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarAlumnoActionPerformed
        // TODO add your handling code here:
        AdminConsultarAlumno consultarAlumno = new AdminConsultarAlumno();
        consultarAlumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miConsultarAlumnoActionPerformed

    private void miListarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarEntrenadorActionPerformed
        // TODO add your handling code here:
        AdminListarCoach listarEntrenador = new AdminListarCoach();
        listarEntrenador.setVisible(true);
    }//GEN-LAST:event_miListarEntrenadorActionPerformed

    private void miConsultarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarEntrenadorActionPerformed
        // TODO add your handling code here:
        AdminConsultarCoach consultarEntrenador = new AdminConsultarCoach();
        consultarEntrenador.setVisible(true);
    }//GEN-LAST:event_miConsultarEntrenadorActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(null, "Está seguro de Salir");
     if (JOptionPane.OK_OPTION==confirmado){
         System.exit(0);
     }
    }//GEN-LAST:event_miSalirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        AdminLogin x = new AdminLogin();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuCurso;
    private javax.swing.JMenu menuDocente;
    private javax.swing.JMenu menuHorarios;
    private javax.swing.JMenu menuMatricula;
    private javax.swing.JMenuItem miAgregarAlumno;
    private javax.swing.JMenuItem miAgregarCurso;
    private javax.swing.JMenuItem miAgregarHorario;
    private javax.swing.JMenuItem miAgregarMatricula;
    private javax.swing.JMenuItem miConsultarAlumno;
    private javax.swing.JMenuItem miConsultarEntrenador;
    private javax.swing.JMenuItem miListarAlumno;
    private javax.swing.JMenuItem miListarCurso;
    private javax.swing.JMenuItem miListarEntrenador;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
