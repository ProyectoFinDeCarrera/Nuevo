/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.cargadores.faqxml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author ribadas
 */
@XmlType(propOrder={"question", "answer"})
public class Faq {
    Long id;
    String question;
    String answer;

    public Faq() {
    }

    public Faq(Long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FAQ id=");
        sb.append(this.id);
        sb.append("\n\tQ: ");
        sb.append(this.question);
        sb.append("\n\tA: ");
        sb.append(this.answer);                
        
        return sb.toString();
    }
    
 
    
    
}
