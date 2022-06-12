/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;
import java.io.*;
import com.sun.speech.freetts.*;

/**
 *
 * @author Torrike
 */
public class LizVoice {
    private static final String VoiceName ="kevin16";
//Stores the name of the voice from the freetts library that will be used
    public void Talk(String words){
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice= voiceManager.getVoice(VoiceName);//Assigns the voice that will be used
        voice.allocate();//Loads the voice into memory
        
        try {
            voice.speak(words);//Loads the string that was sent to the function to be turned into speech
        } catch (Exception e) {
        }
    }
}
