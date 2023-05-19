/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ArbolBPlus;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jose
 */
public class ArbolPlus {
    NodoArbol raiz;

    public ArbolPlus(int orden) {
        this.raiz = new NodoArbol(orden);
    }
    
    public void insertarNuevo(int dato,NodoArbol nodito, NodoArbol padre){
        if(nodito.enlaces.isEmpty()){//cambiar por metodo vacio de array list
            if(nodito.datos.size() < (2*nodito.orden)){
                nodito.datos.add(dato);//metodo para agregar a lisa enlazada de datos
                Collections.sort(nodito.datos);// ordenar la lista de forma ascendete 
            }
            else{
                if(padre.datos.isEmpty()){
                    ArrayList<Integer> aux = nodito.datos;
                    aux.add(dato);
                    Collections.sort(aux);
                    NodoArbol raizAux = new NodoArbol(nodito.orden);
                    raizAux.datos.add(aux.get(nodito.orden));
                    NodoArbol auxIzq = new NodoArbol(nodito.orden);
                    NodoArbol auxDer = new NodoArbol(nodito.orden);
                    for(int i = 0; i<nodito.orden;i++){
                        auxIzq.datos.add(aux.get(i));
                    }
                    for(int i = nodito.orden; i <= 2*nodito.orden; i++ ){
                        auxDer.datos.add(aux.get(i));
                    }
                    raizAux.enlaces.add(auxIzq);
                    raizAux.enlaces.add(auxDer);
                    this.raiz = raizAux;
                }
                else{
                
                
                }
            }
        }
    }
    
    
}
