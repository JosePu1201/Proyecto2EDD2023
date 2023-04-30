/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Listas;

/**
 *
 * @author jose
 */
public class Tabla {
    private String nombre;
    private String clave;
    private String relacion;
    private ListaEnlazadaDoble campos ;

    public Tabla() {
       campos = new ListaEnlazadaDoble();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public ListaEnlazadaDoble getCampos() {
        return campos;
    }

    public void setCampos(ListaEnlazadaDoble campos) {
        this.campos = campos;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Clave: "+clave);
        System.out.println("Relacion: "+relacion);
        campos.imprimirPrincipioAFinal();
        
    }
    
}
