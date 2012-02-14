/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Bea
 */
public class RepresentacionTextual extends Representacion {

    private String texto;

    public RepresentacionTextual() {
    }
    
    

    public RepresentacionTextual(String texto) {
        this.texto = texto;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



}
