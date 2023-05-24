/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ListaFilas;

import com.mycompany.proyecto_2_edd.Listas.ListaEnlazadaDoble;

/**
 *
 * @author jose
 */
public class NodoFila {
    
    private ListaEnlazadaDoble campos;
    private NodoFila siguiente;

    public NodoFila(ListaEnlazadaDoble campos) {
        this.campos = campos;
    }

    public ListaEnlazadaDoble getCampos() {
        return campos;
    }

    public void setCampos(ListaEnlazadaDoble campos) {
        this.campos = campos;
    }

    public NodoFila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
