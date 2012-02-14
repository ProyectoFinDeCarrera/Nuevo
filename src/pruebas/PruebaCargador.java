/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import coleccion.GestorColeccion;
import coleccion.almacenamiento.GestorAlmacenamiento;
import coleccion.almacenamiento.pruebas.AlmacenamientoPruebas;
import coleccion.analizadores.Analizador;
import coleccion.analizadores.stanford.AnalizadorStanford;
import coleccion.cargadores.Cargador;
import coleccion.cargadores.faqxml.CargadorFAQXML;
import java.net.URI;
import java.net.URISyntaxException;
import modelo.Coleccion;

/**
 *
 * @author Bea
 */
public class PruebaCargador {
    
    public static void main(String [] args) throws URISyntaxException{
        Coleccion coleccion= new Coleccion();
        GestorColeccion gestorColeccion= new GestorColeccion();
        gestorColeccion.setColeccion(coleccion);
        
        Cargador cargadorFAQXML = new CargadorFAQXML();
        gestorColeccion.setCargador(cargadorFAQXML);
        
        Analizador analizadorStanford = new AnalizadorStanford();
        gestorColeccion.setAnalizador(analizadorStanford);
        
        
        GestorAlmacenamiento almacenamientoPruebas = new AlmacenamientoPruebas();
        gestorColeccion.setGestorAlmacenamiento(almacenamientoPruebas);
        
        //GestorColeccion.cargador.cargarRecurso("/Users/Bea/Desktop/cbrqa/documentosPruebas/faq_pruebas.xml");//el patch al fichero.

        System.out.println(">>>>>"+gestorColeccion.getCargador()+"   "+gestorColeccion.getAnalizador()+"   "+gestorColeccion.getGestorAlmacenamiento());
        
        gestorColeccion.inicializar(coleccion);
        gestorColeccion.anadirRecurso(new URI("file:///Users/Bea/Desktop/cbrqa/documentosPruebas/faq_pruebas.xml"));
        
        
        
    }
    
}
