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
public class LexicalAnalysis {

    public void performLexicalAnalysis(String sentence){
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();
        CoreDocument coreDocument =  new CoreDocument(sentence);        
        
        System.out.println("====PERFORMING TOKENIZATION====");
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> TokensList = coreDocument.tokens();
        for(CoreLabel coreLabel : TokensList){
            System.out.println(coreLabel.originalText());
        }
        System.out.println("====END OF TOKENIZATION===="+"\n\n");
        
        System.out.println("====PERFORMING SENTENCE RECOGNIZATION====");
        List<CoreSentence> SentencesList = coreDocument.sentences();
        SentencesList.forEach(s -> {
            System.out.println(s.toString());
        });
        System.out.println("====END OF SENTENCE RECOGNIZATION===="+"\n\n");
        
        System.out.println("====PERFORMING PARTS OF SPEECH ANALYSIS====");
        List<CoreLabel> POSList = coreDocument.tokens();
        for(CoreLabel coreLabel: POSList){
            String pos = coreLabel.getString(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText() + " = "+ pos);
        }
        System.out.println("====END OF PARTS OF SPEECH ANALYSIS===="+"\n\n");
        
        System.out.println("====PERFORMING LEMMANTIC ANALYSIS====");
        List<CoreLabel> LemanticList = coreDocument.tokens();
        for(CoreLabel coreLabel: LemanticList){
            String lemma = coreLabel.lemma();
            System.out.println("The root word of "+ coreLabel.originalText() + " is " +lemma);
        }
        System.out.println("====END OF LEMMANTIC ANALYSIS===="+"\n\n");
  
        System.out.println("====PERFORMING NAMED ENTITY RECOGNITION====");
        List<CoreLabel> NERList = coreDocument.tokens();
        for(CoreLabel coreLabel: NERList){
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println("The word "+coreLabel.originalText()+ " is a "+ ner);
        }
        System.out.println("====END OF NAMED ENTITY RECOGNITION===="+"\n\n");
        
        System.out.println("====PERFORMING SENTIMENT ANALYSIS====");
        List<CoreSentence> SAList = coreDocument.sentences();    
        for(CoreSentence coreSentence: SAList){
            String sentiment = coreSentence.sentiment();
            System.out.println("Sentiment: " + sentiment +"\n"+ "Sentence: "+ coreSentence+"\n");
        }
        System.out.println("====END OF SENTIMENT ANALYSIS===="+"\n\n");

        
    }
}
