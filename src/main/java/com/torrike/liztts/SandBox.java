/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import com.spire.pdf.graphics.PdfMargins;
import com.spire.pdf.htmlconverter.qt.HtmlConverter;
import com.spire.pdf.htmlconverter.qt.Size;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Torrike
 */
public class SandBox {
    public static void main(String[] args) throws MalformedURLException, IOException {
        //Specify the url path
        String url = "https://www.wikipedia.org/";
        //Specify the output file path
        String fileName = "C:\\Users\\Torrike\\Documents\\UrlToPdf.pdf";
        //Specify the plugin path
        String pluginPath = "C:\\Users\\Torrike\\Documents\\NetBeansProjects\\LizTTS\\src\\main\\java\\com\\resources\\plugins";
        //Set the plugin path
        HtmlConverter.setPluginPath(pluginPath);
        //Convert URL to PDF
        HtmlConverter.convert(url, fileName, true, 1000000, new Size(1200f, 1000f), new PdfMargins(0));
    }
}
