/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ArbolBPlus.ListaSimpleArbol;

/**
 *
 * @author jose
 */
public class ListaSimple {
    private int tam;
    private int ocupado = 0;
    private NodoListaSimple primero;

    public ListaSimple() {
    }
    
    public void agregarNuevo(NodoListaSimple nuevo){
        if(primero == null){
            this.primero = nuevo;
            ocupado++;
        }
        else{
            NodoListaSimple aux = primero;
            while (aux != null) {
                if(aux.getSiguiente() == null){
                    aux.setSiguiente(nuevo);
                    ocupado++;
                    break;
                }
                aux = aux.getSiguiente();
            }
        }   
    }
    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public NodoListaSimple getPrimero() {
        return primero;
    }

    public void setPrimero(NodoListaSimple primero) {
        this.primero = primero;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
