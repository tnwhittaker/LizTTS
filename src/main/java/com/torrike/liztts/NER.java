/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.ling.CoreAnnotations;
import java.util.List;

/**
 *
 * @author Torrike
 */
public class NER {
    public void ner(String sentence){
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();    
        CoreDocument coreDocument = new CoreDocument(sentence);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabels = coreDocument.tokens();
        for(CoreLabel coreLabel: coreLabels){
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println("The word "+coreLabel.originalText()+ " is a "+ ner);
        }

    }
}
