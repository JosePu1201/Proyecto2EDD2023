/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Graficos;

import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jose
 */
public class botonesArriba extends javax.swing.JPanel {

    /**
     * Creates new form botonesArriba
     */
    private ListaTabla tablas;
    private panelPrincipal principal;

    public botonesArriba(ListaTabla tablas, panelPrincipal principal) {
        this.tablas = tablas;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 153));
        jButton1.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Listar Tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 255, 153));
        jButton2.setFont(new java.awt.Font("Dyuthi", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Listar Listas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TablaPrueba nueva = new TablaPrueba(tablas);
        principal.add(nueva, BorderLayout.CENTER);
        principal.setVisible(false);
        principal.setVisible(true);
        JPanel nuevoPanel = new JPanel();
        nuevoPanel.add(nueva);
        principal.setCentro(nuevoPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ListarFilas nuevo = new ListarFilas(tablas, principal);
        nuevo.setVisible(false);
        nuevo.setVisible(true);
        JPanel nuevoPanel = new JPanel();
        nuevoPanel.add(nuevo);
        principal.setCentro(nuevoPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
