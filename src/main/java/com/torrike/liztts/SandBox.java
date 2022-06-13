package com.torrike.liztts;


import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class SandBox {
   public static void main(String args[]) throws IOException {
      String page = "https://www.jamaicaobserver.com/news/utech-fury/";
      //Connecting to the web page
      //Connection conn = Jsoup.connect(page);
      //executing the get request
      //Document doc = conn.get();
      Response response; 

       try {
            response = Jsoup.connect(page).followRedirects(false).execute();
            if (200 == response.statusCode()){
                System.out.println("com.torrike.liztts.SandBox.main()");
            }
            //System.out.println(a);
       } catch (IOException e) {
           System.out.println("com.torrike.liztts.SandBox.main()22");
       }
      // System.out.println(doc);
      //Retrieving the contents (body) of the web page
      //String result = doc.body().text();
      //System.out.println(result);
   }
}