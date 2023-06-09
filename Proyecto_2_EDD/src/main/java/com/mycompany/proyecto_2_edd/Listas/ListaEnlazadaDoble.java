package com.mycompany.proyecto_2_edd.Listas;

public class ListaEnlazadaDoble {

    Nodo head;
    Nodo tail;

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public ListaEnlazadaDoble() {

    }

    public void agregarAlInicio(Nodo nodoAgregar) { //O(1)
        if (head == null) {
            this.head = nodoAgregar;
            this.tail = nodoAgregar;
        } else {
            head.setAnterior(nodoAgregar);
            head.getAnterior().setSiguiente(head);

            head = head.getAnterior();

        }
    }

    public void agregarAlFinal(Nodo nodoAgregar) { //O(1)
        if (tail == null) {
            this.head = nodoAgregar;
            this.tail = nodoAgregar;
        } else {
            tail.setSiguiente(nodoAgregar);
            tail.getSiguiente().setAnterior(tail);

            tail = tail.getSiguiente();
        }
    }

    public void imprimirPrincipioAFinal() { //O(n)
        head.imprimirSiguientes();
    }

    public void imprimirFinalAPrincipio() { //O(n)
        tail.imprimirAnteriores();
    }

    public int buscar(String informacionBuscada) { //O(n)
        if (head.getInformacion().equals(informacionBuscada)) {
            return 0;
        } else {
            return buscarEnLista(head.siguiente, 1, informacionBuscada);
        }
    }

    public int buscarEnLista(Nodo nodoActual, int indiceNodo, String informacionBuscada) { //O(n)
        if (nodoActual.getInformacion().equals(informacionBuscada)) {
            return indiceNodo;
        } else {
            if (nodoActual.siguiente != null) {
                return buscarEnLista(nodoActual.siguiente, indiceNodo + 1, informacionBuscada);
            } else {
                return -1;
            }
        }
    }

    public void eliminar(String informacionEliminar) { //O(n)
        eliminarEnLista(head, informacionEliminar);
    }

    public void eliminarEnLista(Nodo nodoActual, String informacionEliminar) { //O(n)
        if (nodoActual.getInformacion().equals(informacionEliminar) && (nodoActual != head) && (nodoActual != tail)) {
            if (nodoActual.siguiente != null) {
                nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
                nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
                Nodo siguiente = nodoActual.getSiguiente();
                nodoActual.setAnterior(null);
                nodoActual.setSiguiente(null);
                nodoActual.setInformacion(null);
                eliminarEnLista(siguiente, informacionEliminar);
            } else {
                nodoActual.getAnterior().setSiguiente(null);
                nodoActual.setAnterior(null);
                nodoActual.setSiguiente(null);
                nodoActual.setInformacion(null);
            }
        } else if (nodoActual.getInformacion().equals(informacionEliminar) && (nodoActual == head)) {
            if (nodoActual.siguiente != null) {
                head = nodoActual.getSiguiente();
                head.setAnterior(null);
                nodoActual.setSiguiente(null);
                nodoActual.setInformacion(null);
                eliminarEnLista(head, informacionEliminar);
            } else {
                nodoActual.setAnterior(null);
                nodoActual.setSiguiente(null);
                nodoActual.setInformacion(null);
            }
        } else if (nodoActual.getInformacion().equals(informacionEliminar) && (nodoActual == tail)) {
            tail = tail.getAnterior();
            tail.setSiguiente(null);
            nodoActual.setAnterior(null);
            nodoActual.setSiguiente(null);
            nodoActual.setInformacion(null);
        } else {
            if (nodoActual.siguiente != null) {
                eliminarEnLista(nodoActual.siguiente, informacionEliminar);
            }
        }
    }
    public boolean lleno(){
        boolean bandera = true;
        Nodo aux = head;
        while (aux != null) {            
            if(aux.getDato() == null){
                bandera = false;
                break;
            }
            aux = aux.getSiguiente();
        }
        return bandera;
    }
    
    public boolean buscar(String campo,String dato){
        boolean bandera = false;
        Nodo aux = head;
        while (aux != null) {
            System.out.println(aux.getInformacion()+ " = "+campo);
            System.out.println(aux.getDato()+" = " +dato);
            if(aux.getInformacion().equals(campo) && aux.getDato().equals(dato)){
                bandera = true;
                break;
            }
            aux = aux.getSiguiente();
            
        }
        return  bandera;
    }
        public boolean buscarCampo(String campo){
        boolean bandera = false;
        Nodo aux = head;
        while (aux != null) {            
            if(aux.getInformacion().equals(campo) ){
                bandera = true;
            }
            aux = aux.getSiguiente();
            break;
        }
        return  bandera;
    }
}
