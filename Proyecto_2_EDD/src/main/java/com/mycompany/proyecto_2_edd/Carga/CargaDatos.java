/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2_edd.Carga;

import com.mycompany.proyecto_2_edd.ListaTablas.ListaTabla;
import com.mycompany.proyecto_2_edd.ListaTablas.NodoTabla;
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
            if (f.getName().equals("entrada.dat")) {
                System.out.println("entra aca 1");
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document docXML = builder.parse(f);
                docXML.getDocumentElement().normalize();
                Node raiz = docXML.getDocumentElement();

                // Recorrer los nodos hijos del nodo raíz
                NodeList hijos = raiz.getChildNodes();
                for (int i = 0; i < hijos.getLength(); i++) {
                    Node nodo = hijos.item(i);
                    System.out.println("entra al for: "+i);
                    // Verificar si el nodo es un elemento (etiqueta)
                    if (nodo.getNodeType() == Node.ELEMENT_NODE ) {
                        //Verifica que existe el nombre de la tabla 
                        if(tablas.existe(nodo.getNodeName())){
                            System.out.println("tabla existe");
                            //comienza a validar las entrada de texto
                            validarEntrada(nodo, tablas.buscar(nodo.getNodeName()));
                            System.out.println("Termina de validar y agregar");
                        }
                        else{
                            System.out.println("tabla no existe ");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El nombre del archivo no es correcto");
            }

        } catch (Exception e) {

        }
    }

    public void validarEntrada(Node estructuraEntrada,NodoTabla nodo) {
        //Si hay una relacion
        System.out.println("Entra en esto");
        if(nodo.getTabla().getRelacion() != null){
            System.out.println("Tiene Relacion");
        }
        //sino hay una relacion 
        else{
            System.out.println("No tiene relacion");
             NodeList hijos = estructuraEntrada.getChildNodes();
             for (int i = 0; i < hijos.getLength(); i++) {
                Node nuevo = hijos.item(i);
                if(nuevo.getNodeType() == Node.ELEMENT_NODE){
                    System.out.println("Nodo:" + nuevo.getNodeName());
                    if(nodo.getTabla().existeTipo(nuevo.getNodeName(), nuevo.getTextContent())){
                        System.out.println("Con exito");
                    }
                    else{
                        System.out.println("Hay un problema :c");
                    }
                    
                }
            }
        
        }
    }


}
