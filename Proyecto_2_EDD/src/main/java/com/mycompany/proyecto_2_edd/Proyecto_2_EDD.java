/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_2_edd;

import com.mycompany.proyecto_2_edd.ArbolBPlus.ArbolPlus;
import com.mycompany.proyecto_2_edd.Graficos.panelPrincipal;
import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jose
 */
public class Proyecto_2_EDD {

    public static void main(String[] args) {
        ListaTabla listaTablas = new ListaTabla();
        panelPrincipal nuevoPanel = new panelPrincipal(listaTablas);
        JFrame principal = new JFrame();
        principal.setLocationRelativeTo(null);
        principal.setSize(700,800);
        principal.add(nuevoPanel);
        principal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        principal.setVisible(true);
    }
}
