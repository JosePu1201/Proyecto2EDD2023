/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Carga;

import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import com.mycompany.proyecto_2_edd.ListaTablas.NodoTabla;
import com.mycompany.proyecto_2_edd.Listas.Nodo;
import com.mycompany.proyecto_2_edd.Listas.Tabla;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jose
 */
public class Estructura {

    private ListaTabla tablas;

    public Estructura(ListaTabla tablas) {
        this.tablas = tablas;
    }

    public void cargaDatos(JTextArea texto) throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            if (f.getName().equals("Estructura.xml")) {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document docXML = builder.parse(f);
                docXML.getDocumentElement().normalize();
                Node raiz = docXML.getDocumentElement();

                // Recorrer los nodos hijos del nodo raíz
                NodeList hijos = raiz.getChildNodes();
                for (int i = 0; i < hijos.getLength(); i++) {
                    Node nodo = hijos.item(i);

                    // Verificar si el nodo es un elemento (etiqueta)
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        //ingresa a la etqueta de Estrucura
                        Tabla nueva = new Tabla();
                        // Obtener el nombre del elemento              
                        Nodo(nodo, nueva);
                        if (nueva.existeClave()) {
                            System.out.println("existe y entra");
                            tablas.agregarFinal(new NodoTabla(nueva));
                        }

                    }
                }
//                tablas.listar();
            } else {
                JOptionPane.showMessageDialog(null, "El nombre del archivo no es correcto");
            }

        } catch (Exception e) {

        }
    }

    /*
    *   Recorre lo atributos de una Estructura para crear una tabla 
     */
    private void Nodo(Node nodo, Tabla tab) {
        NodeList hijos = nodo.getChildNodes();
        for (int i = 0; i < hijos.getLength(); i++) {
            Node nuevo = hijos.item(i);
            if (nuevo.getNodeType() == Node.ELEMENT_NODE) {
                String nom = nuevo.getNodeName();
                String type = nuevo.getTextContent();

                if (nom.equals("tabla")) {//obtiene el nombre de la tabla 
                    tab.setNombre(type);
                } else if (nom.equals("clave")) {//obtiene su clave 
                    tab.setClave(type);
                } else if (nom.equals("relacion")) {//obtiene una relacion en caso de que exista 
                    NodoTabla aux = tablas.getPrimero();
                    while (aux != null) {
                        if (aux.getTabla().getNombre().equals(type)) {
                            tab.getCampos().agregarAlFinal(new Nodo(aux.getTabla().getNombre(), "Foraneo"));
                            tab.setRelacion(type);
                            break;
                        }
                        aux = aux.getSiguiente();
                    }
                } else {//obtiene los demas atributos que se van a guardar en una lista enlazada 
                    tab.getCampos().agregarAlFinal(new Nodo(nom, type));
                }
            }
        }
    }
}
