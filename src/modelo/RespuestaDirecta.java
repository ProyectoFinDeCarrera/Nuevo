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
public class RespuestaDirecta extends Respuesta{

    private List <Representacion> representaciones;
    private RepresentacionTextual representacionTextual;

    public RespuestaDirecta() {
    }
    
    

    public List<Representacion> getRepresentaciones() {
        return representaciones;
    }

    public void setRepresentaciones(List<Representacion> representaciones) {
        this.representaciones = representaciones;
    }


    public RepresentacionTextual getRepresentacionTextual() {
        return representacionTextual;
    }

    public void setRepresentacionTextual(RepresentacionTextual representacionTextual) {
        this.representacionTextual = representacionTextual;
    }



}
