/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Graficos;

import com.mycompany.proyecto_2_edd.ListaFilas.ListaSimpleFila;
import com.mycompany.proyecto_2_edd.ListaFilas.NodoFila;
import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import com.mycompany.proyecto_2_edd.ListaTablas.NodoTabla;
import com.mycompany.proyecto_2_edd.Listas.Nodo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class ListarFilas extends javax.swing.JPanel {

    private ListaTabla tablas;
    private panelPrincipal prinicpal;

    /**
     * Creates new form ListarFilas
     */
    public ListarFilas(ListaTabla tablas, panelPrincipal principal) {
        this.tablas = tablas;
        this.prinicpal = principal;
        initComponents();
        listarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(0, 1));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de Tablas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 134, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        combo.setForeground(new java.awt.Color(0, 0, 0));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 157;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 134, 0, 0);
        jPanel1.add(combo, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Aceptar para mostrar las filas de la tabla");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 163, 0, 321);
        jPanel1.add(jLabel2, gridBagConstraints);

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 220, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Listar filas de tablas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 63, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 128, 37, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        add(jPanel1);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        eliminarFilas(modelo);
        //eliminarCol();
        NodoTabla aux = tablas.getPrimero();
        int tam = 0;
        /*
        *Agrega una columna a la tabla 
        */
        while (aux != null) {
            if (aux.getTabla().getNombre().equals(combo.getSelectedItem().toString())) {
                jLabel4.setText(combo.getSelectedItem().toString());
                Nodo aux1 = aux.getTabla().getCampos().getHead();
                while (aux1 != null) {
                    tam++;
                    aux1 = aux1.getSiguiente();
                }
                aux1 = aux.getTabla().getCampos().getHead();
                while (aux1 != null) {
                    modelo.addColumn(aux1.getInformacion());
                    aux1 = aux1.getSiguiente();
                }
                agregarFila(modelo, aux.getTabla().getFilas(), tam);

                break;
            }
            aux = aux.getSiguiente();
        }
        tabla.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     *Agrega una fila a la tabla 
     */
    private void agregarFila(DefaultTableModel modelo, ListaSimpleFila lista, int tam) {
        NodoFila aux = lista.getPrimero();
        while (aux != null) {
            String entra[] = new String[tam];
            int i = 0;
            Nodo aux1 = aux.getCampos().getHead();
            while (aux1 != null) {
                
                if (i < tam) {
                    System.out.print("\t"+aux1.getDato());
                    entra[i] = aux1.getDato();
                    i++;
                }
                aux1 = aux1.getSiguiente();
            }
            System.out.println("");
            modelo.addRow(entra);
            aux = aux.getSiguiente();
        }
    }

    private void eliminarFilas(DefaultTableModel modelo) {
        int tam = modelo.getRowCount() - 1;
        for (int i = tam; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    public void listarTablas() {
        NodoTabla aux = tablas.getPrimero();
        while (aux != null) {
            combo.addItem(aux.getTabla().getNombre());
            aux = aux.getSiguiente();
        }
    }
}
