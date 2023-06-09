/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Carga;

import com.mycompany.proyecto_2_edd.ListaFilas.NodoFila;
import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import com.mycompany.proyecto_2_edd.ListaTablas.NodoTabla;
import com.mycompany.proyecto_2_edd.Listas.ListaEnlazadaDoble;
import com.mycompany.proyecto_2_edd.Listas.Nodo;
import com.mycompany.proyecto_2_edd.Listas.Tabla;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jose
 */
public class CargaDatos {

    private ListaTabla tablas;

    public CargaDatos(ListaTabla tablas) {
        this.tablas = tablas;
    }

    public void cargaDatos(JTextArea texto) throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            if (f.getName().equals("entrada.dat")) {  //Verifica si existe el nodo    
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document docXML = builder.parse(f);
                docXML.getDocumentElement().normalize();
                Node raiz = docXML.getDocumentElement();

                // Recorrer los nodos hijos del nodo raíz
                NodeList hijos = raiz.getChildNodes();
                for (int i = 0; i < hijos.getLength(); i++) {
                    Node nodo = hijos.item(i);
                    
                    if (nodo.getNodeType() == Node.ELEMENT_NODE ) {
                        //Verifica que existe el nombre de la tabla 
                        Tabla auxt = tablas.existe(nodo.getNodeName());
                        System.out.println(auxt.toString());
                      
                            if(auxt != null){
                            validarEntrada(nodo, auxt);
                            }
                    }                 
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "El nombre del archivo no es correcto");
            }

        } catch (Exception e) {

        }
    }

    public void validarEntrada(Node estructuraEntrada,Tabla tabla) {
        //Si hay una relacion
        ListaEnlazadaDoble nuevoFila = clon(tabla.getCampos());
       
        if(tabla.getRelacion() != null){
             NodeList hijos = estructuraEntrada.getChildNodes();
             for (int i = 0; i < hijos.getLength(); i++) {
                Node nuevo = hijos.item(i);
                if(nuevo.getNodeType() == Node.ELEMENT_NODE){
                    if(tabla.existeTipo(nuevo.getNodeName(), nuevo.getTextContent(),nuevoFila)){
                        
                    }
                    else{
                    }
                    
                }
            }
        }
        //sino hay una relacion 
        else{

             NodeList hijos = estructuraEntrada.getChildNodes();
             for (int i = 0; i < hijos.getLength(); i++) {
                Node nuevo = hijos.item(i);
                if(nuevo.getNodeType() == Node.ELEMENT_NODE){
                    if(tabla.existeTipo(nuevo.getNodeName(), nuevo.getTextContent(),nuevoFila)){                       
                    }
                    else{
                    }                   
                }
            }
        
        }
        if(nuevoFila.lleno()){
        tabla.getFilas().agregarNuevo(new NodoFila(nuevoFila));
        nuevoFila = null;
        }
        else{
        }
    }
    public static ListaEnlazadaDoble clon(ListaEnlazadaDoble campos){
        ListaEnlazadaDoble aux = new ListaEnlazadaDoble();
        Nodo aux1 = campos.getHead();
        while (aux1 != null) {            
            aux.agregarAlFinal(new Nodo(aux1.getInformacion(), aux1.getTipo()));
            aux1 = aux1.getSiguiente();
        }
        return aux;
        
    }


}
