/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torrike.liztts;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



/**
 *
 * @author Torrike Whittaker
 */
public class ArticleReader {
    public String Convert(String URL) throws IOException{
        String result ="";
        Response response;
        try {
            if(URL.startsWith("https://") || URL.startsWith("http://")){//Checks if the URL is valid
                response = Jsoup.connect(URL).followRedirects(false).execute();
                if (200 == response.statusCode()){
                //Connects to the submitted web page
                Connection conn = Jsoup.connect(URL);
                //executes the get request for information
                Document doc = conn.get();
                //Retrieves the elements inside the body of the web page
                result = doc.body().text();
                }
            }else{
            JOptionPane.showMessageDialog(null,"URL must start with http:// or http://","Invalid URL",JOptionPane.INFORMATION_MESSAGE);
            //Prompts the user that they must enter a link that fits the criteria
            result = " ";
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,"Site does not exist","Bad URL",JOptionPane.INFORMATION_MESSAGE);
            result = " ";
        }
        
    return result;//Returns the stripped text from the website 

    }
}
