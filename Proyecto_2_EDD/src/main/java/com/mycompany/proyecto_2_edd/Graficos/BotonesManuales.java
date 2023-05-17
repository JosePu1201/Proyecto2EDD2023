/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Graficos;

import com.mycompany.proyecto_2_edd.Carga.Estructura;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author jose
 */
public class BotonesManuales extends javax.swing.JPanel {
    private panelPrincipal principal;
    /**
     * Creates new form BotonesDeCarga
     */
    public BotonesManuales(panelPrincipal principal) {
        this.principal = principal;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cargaM = new javax.swing.JButton();
        cargaD = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        reporte = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setBackground(new java.awt.Color(0, 255, 51));
        jLabel1.setFont(new java.awt.Font("Dyuthi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCIONES MANUALES");
        add(jLabel1);

        cargaM.setBackground(new java.awt.Color(0, 255, 153));
        cargaM.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        cargaM.setForeground(new java.awt.Color(0, 51, 255));
        cargaM.setText("CREAR TABLA");
        cargaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaMActionPerformed(evt);
            }
        });
        add(cargaM);

        cargaD.setBackground(new java.awt.Color(0, 255, 153));
        cargaD.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        cargaD.setForeground(new java.awt.Color(0, 51, 255));
        cargaD.setText("AGREGAR FILA");
        add(cargaD);

        eliminar.setBackground(new java.awt.Color(0, 255, 153));
        eliminar.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 51, 255));
        eliminar.setText("ELIMINAR");
        add(eliminar);

        reporte.setBackground(new java.awt.Color(0, 255, 153));
        reporte.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        reporte.setForeground(new java.awt.Color(0, 51, 255));
        reporte.setText("REPORTE");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });
        add(reporte);
    }// </editor-fold>//GEN-END:initComponents

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteActionPerformed

    private void cargaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMActionPerformed
        TablaCrear nueva = new TablaCrear();
        nueva.setVisible(false);
        nueva.setVisible(true);
        principal.add(nueva,BorderLayout.CENTER);
        principal.setVisible(false);
        principal.setVisible(true);
        
    }//GEN-LAST:event_cargaMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargaD;
    private javax.swing.JButton cargaM;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reporte;
    // End of variables declaration//GEN-END:variables
}
