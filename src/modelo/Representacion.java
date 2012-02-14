/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Bea
 */
public abstract class Representacion {

    private Idioma idioma;//No tengo muy claro si va aquí o en la clase Pregunta.

    public Representacion() {
    }
    

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }



}
