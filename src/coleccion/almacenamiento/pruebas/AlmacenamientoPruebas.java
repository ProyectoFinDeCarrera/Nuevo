/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.almacenamiento.pruebas;

import coleccion.almacenamiento.GestorAlmacenamiento;
import java.util.List;
import modelo.*;

/**
 *
 * @author Bea
 */
public class AlmacenamientoPruebas implements GestorAlmacenamiento{

    @Override
    public void inicializar(Coleccion coleccion) {
        System.out.println("inicializado almacenamiento");
        
    }

    @Override
    public void almacenar(Pregunta pregunta) {
        System.out.println("PREGUNTA A ALMACENAR "+pregunta.getId());
        
        for (Representacion r : pregunta.getRepresentaciones()) {
            if (r instanceof RepresentacionAnalizada) {
                RepresentacionAnalizada ra = (RepresentacionAnalizada) r;
                System.out.println("   "+ra.toString());
            
            }
        }
        
        System.out.println("................................");
        
    }

    @Override
    public Pregunta recuperarPregunta(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pregunta> recuperarConsulta(Consulta consulta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Respuesta recuperarRespuesta(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
