/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.cargadores.faqxml;

import coleccion.cargadores.Cargador;
import coleccion.cargadores.faqxml.jaxb.Faq;
import coleccion.cargadores.faqxml.jaxb.FaqFile;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import modelo.*;

/**
 *
 * @author Bea
 */
public class CargadorFAQXML implements Cargador {

    public void inicializar() {
    }

    public List<Pregunta> cargarRecurso(URI recurso) {
        List<Pregunta> preguntasCargadas = new ArrayList<Pregunta>();
        FaqFile faqFile = null;
        try {
            JAXBContext context = JAXBContext.newInstance(FaqFile.class);
            Unmarshaller um = context.createUnmarshaller();
            faqFile = (FaqFile) um.unmarshal(new File(recurso));
        } catch (JAXBException ex) {
            Logger.getLogger(CargadorFAQXML.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }

        if (faqFile != null) {
            for (Faq faq : faqFile.getFaqs()) {
                preguntasCargadas.add(crearPregunta(faq));
            }
            return preguntasCargadas;
        } else {
            return null;
        }
    }

    private Pregunta crearPregunta(Faq faq) {
        Pregunta pregunta = new Pregunta();

        pregunta.setId(faq.getId());

        RepresentacionTextual representacionTextualPregunta = new RepresentacionTextual(faq.getQuestion());
        pregunta.setRepresentacionTextual(representacionTextualPregunta);
        pregunta.setRepresentaciones(new ArrayList<Representacion>());
        pregunta.getRepresentaciones().add(representacionTextualPregunta);


        RespuestaAlmacenada respuesta = new RespuestaAlmacenada();
        respuesta.setPregunta(pregunta);
        RepresentacionTextual representacionTextualRespuesta = new RepresentacionTextual(faq.getAnswer());
        respuesta.setRepresentacionTextual(representacionTextualRespuesta);
        respuesta.setRepresentaciones(new ArrayList<Representacion>());
        respuesta.getRepresentaciones().add(representacionTextualRespuesta);

        pregunta.setRespuestas(new ArrayList<Respuesta>());
        pregunta.getRespuestas().add(respuesta);

        return pregunta;
    }
}
