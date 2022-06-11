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
    public void Talk(String words){
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice= voiceManager.getVoice(VoiceName);
        voice.allocate();
        
        try {
            voice.speak(words);
        } catch (Exception e) {
        }
    }
}
