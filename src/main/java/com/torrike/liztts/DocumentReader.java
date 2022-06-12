/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ooxml.POIXMLProperties.CoreProperties;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
/**
 *
 * @author Torrike
 */
public class DocumentReader {
    public String ReadPDFFile(String location) throws FileNotFoundException, IOException{
        File file = new File(location);
       
            FileInputStream fileInputStream = new FileInputStream(file);
            PDDocument pdfDDocument = PDDocument.load(fileInputStream);
            PDFTextStripper pdfts = new PDFTextStripper();
            return pdfts.getText(pdfDDocument);            
    }
    
    public String ReadWordFile(String location) throws FileNotFoundException, IOException{
            try(XWPFDocument document = new XWPFDocument(Files.newInputStream(Paths.get(location)))){
                XWPFWordExtractor xWPFWordExtractor = new XWPFWordExtractor(document);
                String docString = xWPFWordExtractor.getText();
                return docString;
            }
            

        }
    
    public String ReadPowerPointFile(String location) throws FileNotFoundException, IOException{
        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(location));
        CoreProperties props = ppt.getProperties().getCoreProperties();
        String title = props.getTitle();
        System.out.println("Title: " + title);
        String text ="";
        int slideCount=1;
        for (XSLFSlide slide: ppt.getSlides()) {
                text = text.concat("Starting slide number "+slideCount+"\n");
                slideCount++;
        	List<XSLFShape>shapes = slide.getShapes();
        	for (XSLFShape shape: shapes) {
        		if (shape instanceof XSLFTextShape) {
        	        XSLFTextShape textShape = (XSLFTextShape)shape;
        	        text = text.concat("Text: "+textShape.getText()+"\n");
        		}
        	}
        }
        return text;
    }
    
    public String ReadTXTFile(String location) throws FileNotFoundException{
        File file = new File(location);
        Scanner sc = new Scanner(file);
        String text= "";
        while (sc.hasNextLine()){
            text = text.concat(sc.nextLine());
            //System.out.println(sc.nextLine());
        }
        
        return text;
    }
    
}//End of class
