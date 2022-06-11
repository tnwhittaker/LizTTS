/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author Torrike
 */
public class SentimentAnalysis {
        public void SAN(String sentence){
            StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();
            CoreDocument coreDocument = new CoreDocument(sentence);
            stanfordCoreNLP.annotate(coreDocument);
            List<CoreSentence> coreSentences = coreDocument.sentences();    
        for(CoreSentence coreSentence: coreSentences){
            String sentiment = coreSentence.sentiment();
            System.out.println("Sentiment: " + sentiment +"\n"+ "Sentence: "+ coreSentence);
        }
        }
        
}
