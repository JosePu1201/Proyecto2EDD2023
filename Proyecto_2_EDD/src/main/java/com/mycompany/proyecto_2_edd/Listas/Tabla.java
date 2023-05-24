/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Listas;

import com.mycompany.proyecto_2_edd.ListaFilas.ListaSimpleFila;

/**
 *
 * @author jose
 */
public class Tabla {
    private String nombre;
    private String clave;
    private String relacion;
    private int claveEntrada;
    private ListaEnlazadaDoble campos ;
    private ListaSimpleFila filas;

    public Tabla() {
       campos = new ListaEnlazadaDoble();
       filas = new ListaSimpleFila();
    }

    public int getClaveEntrada() {
        return claveEntrada;
    }

    public void setClaveEntrada(int claveEntrada) {
        this.claveEntrada = claveEntrada;
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

    public ListaSimpleFila getFilas() {
        return filas;
    }

    public void setFilas(ListaSimpleFila filas) {
        this.filas = filas;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Clave: "+clave);
        System.out.println("Relacion: "+relacion);
        campos.imprimirPrincipioAFinal();
        
    }
    
    public boolean existeTipo(String tipo,String datos,ListaEnlazadaDoble filas){
        System.out.println("Tipo: "+tipo);
        System.out.println("Dato: "+datos);
        boolean bandera = false;
        Nodo aux = filas.head;
        while (aux != null) {            
            if(tipo.equals(aux.getInformacion())){              
                aux.valTipo(datos);
                bandera = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        return bandera;
    }
    
    public boolean existeClave(){
        System.out.println("Clave:"+clave);
        boolean ex = false;
        Nodo aux = campos.getHead();
        while (aux != null) {
            System.out.println("Nodo: "+ aux.getInformacion());            
            if(clave.equals(aux.getInformacion())){
                System.out.println("existe para: "+clave);
                ex = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        return ex;
    }
}
