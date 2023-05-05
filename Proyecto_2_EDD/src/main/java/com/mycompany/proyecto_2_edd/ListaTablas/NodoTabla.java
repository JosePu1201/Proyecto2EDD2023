/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.ListaTablas;

import com.mycompany.proyecto_2_edd.Listas.Tabla;

/**
 *
 * @author jose
 */
public class NodoTabla {
    private Tabla tabla;
    private int nivel;
    private int pos;
    private NodoTabla anterior;
    private NodoTabla siguiente;
    
    public NodoTabla(Tabla nueva){
        this.tabla = nueva;
        
    }
    public Tabla getTabla() {
        return tabla;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public NodoTabla getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoTabla anterior) {
        this.anterior = anterior;
    }

    public NodoTabla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTabla siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        tabla.imprimir();
        return "\nNivel: " + nivel + "\nPos: " + pos +"\n";
    }
    
    
}
