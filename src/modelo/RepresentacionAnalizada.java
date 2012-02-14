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
public class RepresentacionAnalizada extends Representacion{

    private List <Termino> terminos;

    public RepresentacionAnalizada() {
    }


    public List<Termino> getTerminos() {
        return terminos;
    }

    public void setTerminos(List<Termino> terminos) {
        this.terminos = terminos;
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("RESP. ANALIZADA: ");
        
        for (Termino t : this.terminos){
            sb.append(t.getEtiqueta());
            sb.append(", ");
            
        }
        
        return sb.toString();
    }



}
