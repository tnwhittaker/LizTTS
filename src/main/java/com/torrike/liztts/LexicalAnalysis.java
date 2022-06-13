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
 * @author Torrike Whittaker
 */
public class LexicalAnalysis {

    public void performLexicalAnalysis(String sentence){
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();
        CoreDocument coreDocument =  new CoreDocument(sentence);        
        System.out.println("The sentence: "+sentence+"\n");
        System.out.println("======================================================");
        
        System.out.println("==========PERFORMING TOKENIZATION==========");
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> TokensList = coreDocument.tokens();//Stores in a list all the recorded tokens
        for(CoreLabel coreLabel : TokensList){
            System.out.println(coreLabel.originalText());
        }//Loops through the list and prints the tokens
        
        System.out.println("====END OF TOKENIZATION===="+"\n\n");
        
        System.out.println("==========PERFORMING SENTENCE RECOGNIZATION==========");
        List<CoreSentence> SentencesList=coreDocument.sentences();//List that contains all the recognized sentences 
        SentencesList.forEach(s -> {
            System.out.println(s.toString());//Loops through the list and prints the sentences
        });
        System.out.println("==========END OF SENTENCE RECOGNIZATION=========="+"\n\n");
        
        System.out.println("==========PERFORMING PARTS OF SPEECH ANALYSIS==========");
        //Parts of speech was included in the library's vocabulary so there was no need to build one of my own
        List<CoreLabel> POSList = coreDocument.tokens();
        for(CoreLabel coreLabel: POSList){
            String pos = coreLabel.getString(CoreAnnotations.PartOfSpeechAnnotation.class);
            //Assigns each token a part of speech and stores it in a list
            System.out.println(coreLabel.originalText() + " = "+ pos);
            //Prints out the original word and its part of speech

        }
        System.out.println("==========END OF PARTS OF SPEECH ANALYSIS=========="+"\n\n");
        
        System.out.println("==========PERFORMING LEMMANTIC ANALYSIS==========");
        List<CoreLabel> LemanticList = coreDocument.tokens();//List to store tokens
        for(CoreLabel coreLabel: LemanticList){
            String lemma = coreLabel.lemma();
            //Finds the root word for each token identified
            System.out.println("The root word of "+ coreLabel.originalText() + " is " +lemma);
        }
        System.out.println("==========END OF LEMMANTIC ANALYSIS=========="+"\n\n");
  
        System.out.println("==========PERFORMING NAMED ENTITY RECOGNITION==========");
        List<CoreLabel> NERList = coreDocument.tokens();
        for(CoreLabel coreLabel: NERList){
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            //Checks what the token is and stores it in a variable
            System.out.println("The word "+coreLabel.originalText()+ " is a "+ ner);
            //Prints out what each token is classified as
        }
        System.out.println("==========END OF NAMED ENTITY RECOGNITION=========="+"\n\n");
        
        System.out.println("==========PERFORMING SENTIMENT ANALYSIS==========");
        List<CoreSentence> SAList = coreDocument.sentences();    
        //List to store gathered sentences
        for(CoreSentence coreSentence: SAList){
            String sentiment = coreSentence.sentiment();
            //Determines the tone of the sentence and stores it in a variable
            System.out.println("Sentiment: " + sentiment +"\n"+ "Sentence: "+ coreSentence+"\n");
        }
        System.out.println("==========END OF SENTIMENT ANALYSIS=========="+"\n\n");

        
    }
}
