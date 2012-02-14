/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.cargadores.faqxml.jaxb;

import coleccion.cargadores.faqxml.jaxb.Faq;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ribadas
 */
@XmlRootElement
public class FaqFile {
    String filename;
    String language;
    List<Faq> faqs;

    public FaqFile() {
    }

    public FaqFile(String filename, String language) {
        this.filename = filename;
        this.language = language;
    }

    @XmlElementWrapper(name="faqs")
    @XmlElement(name="faq")
    public List<Faq> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<Faq> faqs) {
        this.faqs = faqs;
    }

    @XmlAttribute
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @XmlAttribute
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    
}
