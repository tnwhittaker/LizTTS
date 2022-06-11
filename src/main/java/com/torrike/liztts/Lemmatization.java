/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author Torrike
 */
public class Lemmatization {
    public void Lemm(String sentence){
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();    
        CoreDocument coreDocument = new CoreDocument(sentence);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> corelabellist = coreDocument.tokens();
        for(CoreLabel coreLabel: corelabellist){
            String lemma = coreLabel.lemma();
            System.out.println("The root word of "+ coreLabel.originalText() + " is " +lemma);
        }
    }
}
