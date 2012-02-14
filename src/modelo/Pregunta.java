/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.List;


/**
 *
 * @author Bea
 */
public class Pregunta {

    
    
    private long id;
    private Coleccion coleccion;
    private Idioma idioma;
    private RepresentacionTextual representacionTextual;
    private List<Representacion> representaciones;
    private List<Respuesta> respuestas;

    public Pregunta() {
        
       }
    
    

    public Pregunta(long id, Coleccion coleccion, Idioma idioma, RepresentacionTextual representacionTextual, List<Representacion> representaciones, List<Respuesta> respuestas) {
        this.id = id;
        this.coleccion = coleccion;
        this.idioma = idioma;
        this.representacionTextual = representacionTextual;
        this.representaciones = representaciones;
        this.respuestas = respuestas;
    }
    
    
    
    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public RepresentacionTextual getRepresentacionTextual() {
        return representacionTextual;
    }

    public void setRepresentacionTextual(RepresentacionTextual representacionTextual) {
        this.representacionTextual = representacionTextual;
    }

    public List<Representacion> getRepresentaciones() {
        return representaciones;
    }

    public void setRepresentaciones(List<Representacion> representaciones) {
        this.representaciones = representaciones;
    }
    
    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

   
}
