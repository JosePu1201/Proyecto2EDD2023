/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ArbolBPlus;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class NodoArbol {
    ArrayList<Integer> datos;//Cambiar por una lista enlazada 
    ArrayList<NodoArbol> enlaces;//Cambiar por lista enlazada 
    NodoArbol enlaceshoja;
    int orden;
    
    public NodoArbol(int orden) {
        this.orden = orden;
        datos = new ArrayList<>(2*orden);
        enlaces = new ArrayList<> (2*orden+1);
        enlaceshoja = null;
    
    }
    
}
