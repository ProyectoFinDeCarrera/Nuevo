/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bea
 */
public class ConsultaTextual implements Consulta{
    
    private String texto;

    public ConsultaTextual() {
    }

    public ConsultaTextual(String texto) {
        this.texto = texto;
    }

    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
