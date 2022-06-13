/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Torrike
 */
public class PDFReader {
    public String ReadFile(String location) throws FileNotFoundException, IOException{
        File file = new File(location);
       
            FileInputStream fileInputStream = new FileInputStream(file);
            PDDocument pdfDDocument = PDDocument.load(fileInputStream);
            PDFTextStripper pdfts = new PDFTextStripper();
            return pdfts.getText(pdfDDocument);            
        
    }
}
