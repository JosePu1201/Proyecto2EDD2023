/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ArbolBPlus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author jose
 */
public class ArbolPlus {
    public NodoArbol raiz;

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
                    ArrayList<Integer> aux = nodito.datos;
                    aux.add(dato);
                    Collections.sort(aux);//metodo de de ordenamiento 
                    padre.datos.add(aux.get(nodito.orden));//agregar en una posicion 
                    Collections.sort(padre.datos);//metodo de de ordenamiento 
                    NodoArbol auxIzq = new NodoArbol(nodito.orden);
                    NodoArbol auxDer = new NodoArbol(nodito.orden);
                    for(int i = 0; i<nodito.orden;i++){
                        auxIzq.datos.add(aux.get(i));
                    }
                    for(int i = nodito.orden; i <= 2*nodito.orden; i++ ){
                        auxDer.datos.add(aux.get(i));
                    }
                    
                    padre.enlaces.remove(nodito);//remover esa direccion 
                    padre.enlaces.add(auxIzq);
                    padre.enlaces.add(auxDer);
                    Collections.sort(padre.enlaces,new Ordenar());//Agregar la funcionalidad de ordenamientode la clase Ordenar.java
                }
            }
        }
        else{
            int cont = 0;
            
            for(cont = 0; cont < nodito.datos.size(); cont ++){
                if(dato < nodito.datos.get(cont)){
                    break;
                }
            }
            //Recursividad 
            insertarNuevo(dato, nodito.enlaces.get(cont), nodito);
        }
    }
    
    public void imprimir(NodoArbol nodito){
        if(nodito.enlaces.isEmpty()){
            System.out.println(nodito.datos.toString());
        }
        else{
            for (int i = 0; i < nodito.datos.size() ; i++) {
                imprimir(nodito.enlaces.get(i));
                System.out.print("enlaces: ");
                System.out.println(nodito.datos.get(i));
            }
            imprimir(nodito.enlaces.get(nodito.enlaces.size() -1));
        }
    }
    
    
}
