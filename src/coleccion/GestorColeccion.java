/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coleccion;

import coleccion.almacenamiento.GestorAlmacenamiento;
import coleccion.analizadores.Analizador;
import coleccion.analizadores.TipoAnalisis;
import coleccion.cargadores.Cargador;
import java.net.URI;
import java.util.List;
import modelo.Coleccion;
import modelo.Consulta;
import modelo.Pregunta;
import modelo.RepresentacionAnalizada;

/**
 *
 * @author Bea
 */
public class GestorColeccion {

   private Cargador cargador;
   private Analizador analizador;
   private GestorAlmacenamiento gestorAlmacenamiento;
   private Coleccion coleccion;

    
    public Analizador getAnalizador() {
        return analizador;
    }

    public void setAnalizador(Analizador analizador) {
        this.analizador = analizador;
    }

    public Cargador getCargador() {
        return cargador;
    }

    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    public GestorAlmacenamiento getGestorAlmacenamiento() {
        return gestorAlmacenamiento;
    }

    public void setGestorAlmacenamiento(GestorAlmacenamiento gestorAlmacenamiento) {
        this.gestorAlmacenamiento = gestorAlmacenamiento;
    }
   
   public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }


    public void inicializar(Coleccion coleccion){
        //inicializar Cargadores y Analizadores
        cargador.inicializar();
        analizador.inicializar();
        gestorAlmacenamiento.inicializar(coleccion);

    }

    public void anadirRecurso(URI recurso){
        
        System.out.println("URI:" + recurso.toString());
        
        List <Pregunta> preguntas= cargador.cargarRecurso(recurso);
        
        System.out.println("Numero preguntas: " + preguntas.size());
        
        for(Pregunta pregunta:preguntas){
           RepresentacionAnalizada representacionAnalizada=analizador.analizar(pregunta.getRepresentacionTextual(), TipoAnalisis.PREGUNTA);
           pregunta.getRepresentaciones().add(representacionAnalizada);
           gestorAlmacenamiento.almacenar(pregunta);
        }

    }

    public void eliminarPregunta(long id){

    }

    public Pregunta recuperarPregunta(long id){

        Pregunta pregunta= new Pregunta();
        return pregunta;

    }

    public List<Pregunta> recuperarConsulta(Consulta consulta){

            return null;
    }





}
