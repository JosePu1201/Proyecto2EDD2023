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
public class Eliminacion {
    private ListaTabla tablas;

    public Eliminacion(ListaTabla tablas) {
        this.tablas = tablas;
    }
    public void cargaDatos(JTextArea texto) throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
//        try {
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            if (f.getName().equals("elimina.dat")) {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document docXML = builder.parse(f);
                docXML.getDocumentElement().normalize();
                Node raiz = docXML.getDocumentElement();

                // Recorrer los nodos hijos del nodo raíz
               
                NodeList hijos = raiz.getChildNodes();
                for (int i = 0; i < hijos.getLength(); i++) {
                String tabla="";
                String campo="";
                String fato="";
                    Node nodo = hijos.item(i);
                    // Verificar si el nodo es un elemento (etiqueta)
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        //ingresa a la etqueta de Estrucura
                         tabla = nodo.getNodeName();
                        
                        NodeList subhijos = nodo.getChildNodes();
                        for (int j = 0; j < subhijos.getLength(); j++) {
                            Node nodito = subhijos.item(j);
                            if(nodito.getNodeType() == Node.ELEMENT_NODE){
                                campo = nodito.getNodeName();
                                fato = nodito.getTextContent();
                                System.out.println(campo+"----,--- "+fato);
                            }
                            
                        }
                    }
                    eliminar(tabla, campo, fato, tablas);
                }
//                tablas.listar();
            } else {
                JOptionPane.showMessageDialog(null, "El nombre del archivo no es correcto");
            }

        } catch (Exception e) {

        }
    }
    
    public static void eliminar (String nombreTabla, String campo,String dato,ListaTabla tablas){
        System.out.println("Tabla eliminar: "+nombreTabla);
        System.out.println("Campo eliminar: "+campo);
        System.out.println("Dato elimiar: "+dato);
        NodoTabla aux = tablas.getPrimero();
        while (aux != null) {            
            if(aux.getTabla().getNombre().equals(nombreTabla)){
                System.out.println("------------------------------------");
                System.out.println("Encontrado");
                aux.getTabla().imprimir();
                aux.getTabla().getFilas().eliminar(campo, dato);
                System.out.println("++++++++++++++++++++++++++++++++++++");
                break;
            }
            aux = aux.getSiguiente();
        }
    
    }
}
