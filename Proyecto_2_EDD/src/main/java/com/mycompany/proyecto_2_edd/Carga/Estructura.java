/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Carga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
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

    public Estructura() {
        
    }
    
 public void cargaDatos(JTextArea texto) throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();

            File f = new File(ruta);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document docXML = builder.parse(f);
            docXML.getDocumentElement().normalize();
            
            System.out.println("Raiz:" + docXML.getDocumentElement().getNodeName());
            Node raiz = docXML.getDocumentElement();
            
            // Recorrer los nodos hijos del nodo raíz
            NodeList hijos = raiz.getChildNodes();
            for (int i = 0; i < hijos.getLength(); i++) {
                Node nodo = hijos.item(i);
                
                // Verificar si el nodo es un elemento (etiqueta)
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Obtener el nombre del elemento
                    String nombreElemento = nodo.getNodeName();
                    System.out.println("Elemento: " + nombreElemento);
                    
                    // Obtener el valor del elemento (si lo tiene)
                    String valorElemento = nodo.getTextContent();
                    System.out.println("Valor: " + valorElemento);
                    
                    // Recorrer los atributos del elemento (si los tiene)
                    if (nodo.hasAttributes()) {
                        System.out.println("Atributos:");
                        for (int j = 0; j < nodo.getAttributes().getLength(); j++) {
                            Node atributo = nodo.getAttributes().item(j);
                            String nombreAtributo = atributo.getNodeName();
                            String valorAtributo = atributo.getNodeValue();
                            System.out.println("- " + nombreAtributo + ": " + valorAtributo);
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
