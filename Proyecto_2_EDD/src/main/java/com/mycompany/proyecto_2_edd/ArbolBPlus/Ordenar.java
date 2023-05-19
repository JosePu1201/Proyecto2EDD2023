/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ArbolBPlus;
import java.util.Comparator;
/**
 *
 * @author jose
 */
public class Ordenar implements Comparator<NodoArbol>{

    @Override
    public int compare(NodoArbol n1, NodoArbol n2){
        if(n1.datos.get(0) > n2.datos.get(0)){
            return 1;
        }
        else if(n1.datos.get(0) < n2.datos.get(0)){
            return -1;
        }
        else{
            return 0;
                    
        }
    }

}
