/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.analizadores.stanford;

import coleccion.analizadores.Analizador;
import coleccion.analizadores.TipoAnalisis;
import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import modelo.RepresentacionAnalizada;
import modelo.RepresentacionTextual;
import modelo.Termino;

/**
 *
 * @author Bea
 */
public class AnalizadorStanford implements Analizador {

    StanfordCoreNLP pipeline;

    public void inicializar() {
        Properties props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        pipeline = new StanfordCoreNLP(props);

    }

    @Override
    public RepresentacionAnalizada analizar(RepresentacionTextual representacionTextual, TipoAnalisis tipo) {

        // create an empty Annotation just with the given text
        Annotation document = new Annotation(representacionTextual.getTexto());

        List<Termino> listaTerminos = new ArrayList<Termino>();

        // run all Annotators on this text
        pipeline.annotate(document);

        // these are all the sentences in this document
        // a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
        List<CoreMap> sentences = document.get(SentencesAnnotation.class);


        for (CoreMap sentence : sentences) {
            // traversing the words in the current sentence
            // a CoreLabel is a CoreMap with additional token-specific methods
            for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
                // this is the text of the token
                String word = token.get(TextAnnotation.class);
                // this is the POS tag of the token
                String pos = token.get(PartOfSpeechAnnotation.class);
                // this is the NER label of the token
                String ne = token.get(NamedEntityTagAnnotation.class);

                //Añadimos a la lista de terminos solo los nombres, verbos y adjetivos.
                if (pos.charAt(0) == 'N' || pos.charAt(0) == 'V' || pos.charAt(0) == 'J') {
                    //Termino t = new Termino();
                    //t.setEtiqueta(word);
                    //listaTerminos.add(t);

                    listaTerminos.add(new Termino(word));                
                }
            }
        }

        RepresentacionAnalizada representacionAnalizada = new RepresentacionAnalizada();
        representacionAnalizada.setTerminos(listaTerminos);
        return representacionAnalizada;
    }
}
