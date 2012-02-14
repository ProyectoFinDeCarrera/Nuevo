/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coleccion.cargadores;

import java.net.URI;
import java.util.List;
import modelo.Pregunta;

/**
 *
 * @author Bea
 */
public interface Cargador {

    public void inicializar();

    public List <Pregunta> cargarRecurso(URI recurso);



}
