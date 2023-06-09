/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Graficos;

import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import com.mycompany.proyecto_2_edd.ListaTablas.NodoTabla;
import com.mycompany.proyecto_2_edd.Listas.Tabla;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class TablaPrueba extends javax.swing.JPanel {

    /**
     * Creates new form TablaPrueba
     */

    private ListaTabla tablas;
    public TablaPrueba(ListaTabla tabla) {
        this.tablas = tabla;
        initComponents();
        generarTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(0, 1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Jamrul", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LISTA DE TABLAS EXISTENTES ");
        jPanel1.add(jLabel1);

        add(jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Llave Primaria", "Llave Foreane"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    public void generarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        insertarTabla(modelo);
        this.setVisible(true);
    }
    public void insertarTabla(DefaultTableModel modelo){
        NodoTabla aux = tablas.getPrimero();
        while (aux != null) {            
            String [] entrada = {aux.getTabla().getNombre(),aux.getTabla().getClave(),aux.getTabla().getRelacion()};
            modelo.addRow(entrada);
            aux.getTabla().imprimir();
            aux = aux.getSiguiente();
            
        }
        
    
    }
}
