/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ListaTablas;

/**
 *
 * @author jose
 */
public class ListaTabla {
    private NodoTabla primero;
    private NodoTabla ultimo;
    
    public ListaTabla() {
    
    }
    
    public void agregarFinal(NodoTabla nuevo){
        if(primero == null){
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else{
            ultimo.setSiguiente(nuevo);
            ultimo.getSiguiente().setAnterior(nuevo);
            
            ultimo = ultimo.getSiguiente();
        }
        
    }
    
    public void listar(){
        NodoTabla aux = primero;
        
        while (aux != null) {            
            System.out.println(aux.toString());
            aux = aux.getSiguiente();
        }
    }
}
