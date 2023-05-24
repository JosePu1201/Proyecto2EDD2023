/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ListaFilas;

/**
 *
 * @author jose
 */
public class ListaSimpleFila {
   private int tam;
    private int ocupado = 0;
    private NodoFila primero;

    public ListaSimpleFila() {
    }
    
    public void agregarNuevo(NodoFila nuevo){
        nuevo.getCampos().imprimirFinalAPrincipio();
        if(primero == null){
            this.primero = nuevo;
            ocupado++;
        }
        else{
            NodoFila aux = primero;
            while (aux.getSiguiente() != null) {          
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            ocupado ++;
        }   
    }
    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public NodoFila getPrimero() {
        return primero;
    }

    public void setPrimero(NodoFila primero) {
        this.primero = primero;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
