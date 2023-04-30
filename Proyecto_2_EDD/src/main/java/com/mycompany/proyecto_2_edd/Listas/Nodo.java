package com.mycompany.proyecto_2_edd.Listas;

public class Nodo {

    private String informacion;
    private String tipo;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(String informacion,String tipo) {
        this.informacion = informacion;
        this.tipo = tipo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void agregarAlInicio(Nodo nodoAgregar) {

    }

    public void imprimirSiguientes() {
        System.out.println("Atributo: " + informacion+"\tTipo: " + tipo);
        if (siguiente != null) {
            siguiente.imprimirSiguientes();
        }
    }

    public void imprimirAnteriores() {
       System.out.println("Atributo: " + informacion+"\tTipo: " + tipo);
        if (anterior != null) {
            anterior.imprimirAnteriores();
        }
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
