/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coleccion.analizadores;

import modelo.RepresentacionAnalizada;
import modelo.RepresentacionTextual;

/**
 *
 * @author Bea
 */
public interface Analizador {

    public void inicializar();
    RepresentacionAnalizada analizar(RepresentacionTextual representacionTextual,TipoAnalisis tipo);

}
