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
//        ArbolPlus nuevoplus = new ArbolPlus(5);
//        nuevoplus.insertarNuevo(5, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(10, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(25, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(35, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(18, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(81, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(1, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(3, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(105, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(22, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(23, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(2225, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.insertarNuevo(2224, nuevoplus.raiz, nuevoplus.raiz);
//        nuevoplus.imprimir(nuevoplus.raiz);
        
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
