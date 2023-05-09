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

    public void agregarFinal(NodoTabla nuevo) {

        if (repetido(nuevo)) {//valida repitencia de nombre
            if (nuevo.getTabla().getRelacion() == null) {
                agregar(nuevo);
            } else {//valida si existe referencia 
                if (validarRef(nuevo)) {
                    agregar(nuevo);
                } else {
                    System.out.println("Fallo la referencia");
                }
            }

        } else {
            System.out.println("El nombre se repito");
        }
    }

    public void agregar(NodoTabla nuevo) {
        if (primero == null) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo.getSiguiente().setAnterior(nuevo);
            ultimo = ultimo.getSiguiente();
        }
    }

    public void listar() {
        NodoTabla aux = primero;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getSiguiente();
        }
    }

    public boolean validarRef(NodoTabla nuevo) {
        boolean valido = false;
        NodoTabla aux = primero;
        while (aux != null) {
            if (aux.getTabla().getNombre().equals(nuevo.getTabla().getRelacion())) {
                valido = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        return valido;
    }

    public boolean repetido(NodoTabla nuevo) {
        boolean valido = true;
        NodoTabla aux = primero;
        while (aux != null) {
            if (aux.getTabla().getNombre().equals(nuevo.getTabla().getNombre())) {
                valido = false;
                break;
            }
            aux = aux.getSiguiente();
        }
        return valido;
    }

}
