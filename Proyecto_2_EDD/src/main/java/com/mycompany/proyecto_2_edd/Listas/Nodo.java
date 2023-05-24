package com.mycompany.proyecto_2_edd.Listas;

public class Nodo {

    private String informacion;
    private String tipo;
    private String dato;
    private  boolean banderaFor = false;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(String informacion, String tipo) {
        this.informacion = informacion;
        this.tipo = tipo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
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
        System.out.println(toString());
        if (siguiente != null) {
            siguiente.imprimirSiguientes();
        }
    }

    public void imprimirAnteriores() {
        System.out.println(toString());
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

    public void valTipo(String entrada) {
        System.out.println("entra a validar con esta entrada: "+entrada);
        System.out.println("Valida con este tipo de dato: "+tipo);
        boolean banderaTipo = false;
       
        if (tipo.equals("int")) {
            try {
                Integer.parseInt(entrada);
                banderaTipo = true;
            } catch (Exception a) {
                System.out.println("error no es el mismo tipo ");
            }
        } else if (tipo.equals("double")) {
            try {
                Double.parseDouble(entrada);
                banderaTipo = true;
            } catch (Exception a) {
                System.out.println("error no es el mismo tipo ");
            }
        } else if (tipo.equals("float")) {
            try {
                Float.parseFloat(entrada);
                banderaTipo = true;
            } catch (Exception a) {
                System.out.println("error no es el mismo tipo ");
            }
        } else if (tipo.equals("boolean")) {
            try {
                Boolean.parseBoolean(entrada);
                banderaTipo = true;
            } catch (Exception a) {
                System.out.println("error no es el mismo tipo ");
            }
        } else if (tipo.equals("char")) {
            if(entrada.length() == 1){
                banderaTipo = true;
            }
            else{
                System.out.println("error");
            }
        }
        else if(tipo.equals("String")){
            banderaTipo = true;
        }
        else if(tipo.equals("Foraneo")){
            banderaFor = true;
            banderaTipo = true;
        }
        
        if(banderaTipo){
            System.out.println("Tipo: "+tipo+"\tDato: "+dato);
            dato = entrada;
        }
        else{
           
        }

    }

    public boolean isBanderaFor() {
        return banderaFor;
    }

    public void setBanderaFor(boolean banderaFor) {
        this.banderaFor = banderaFor;
    }

    @Override
    public String toString() {
        return "Nodo:\n" + "Informacion: " + informacion + "\tTipo: " + tipo + "\tDato: " + dato + "\n";
    }

}
