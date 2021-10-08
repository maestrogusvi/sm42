package com.ut.sm42.service;


import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Service
public class HttpService {







    public String sendRequestHttpS(String url, String method, String username, String password, String type, String body, String token) throws IOException {
        URL obt= new URL(url);
        HttpURLConnection con =null;
        try {
            con = (HttpURLConnection) obt.openConnection();
            con.setRequestMethod(method);
           // con.setRequestProperty("X-Experience-Api-Version","1.0.1");

            if(username != null){
                con.setRequestProperty("user", username);
                con.setRequestProperty("password", password);
            }
            if(token!= null){
                con.setRequestProperty("Authorization",token);
            }
            if(method=="POST"){
                if(type=="soap"){
                    con.setRequestProperty("Content-Type","application/soap+xml; charset=utf-8");
                    con.setDoOutput(true);
                    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                    wr.writeBytes(body);
                    wr.flush();
                    wr.close();
                }
                if(type=="json"){
                    con.setRequestProperty("Content-Type","application/json; charset=utf-8");
                    if(body!=null){
                        con.setDoOutput(true);
                        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                        wr.writeBytes(body);
                        wr.flush();
                        wr.close();
                    }

                }
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Api CAIDA, no se puede conectar");
            return "[{\"status\":\"Error\", \"detail\":{\"id\":\"Null\"}}]";
        }




        //con.setConnectTimeout(30*1000);
        //con.setReadTimeout(30*1000);
        int responseCode=0;
        try{
            responseCode = con.getResponseCode();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Api CAIDA, no se puede conectar");
            return "[{\"status\":\"Error\", \"detail\":{\"id\":\"Null\"}}]";
        }

        //System.out.println(" Response Code :: " + responseCode);
        String inputLine;
        StringBuffer response = new StringBuffer();
        String finalString ="";
        switch (responseCode){

            case 200:
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));


                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();
                    // print result
                    //System.out.println(response.toString());
                    finalString=response.toString();


                 break;

            case 201:

                 in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // print result
                //System.out.println(response.toString());
               // finalString=response.toString();
                finalString="{\"status\":\"Created\", \"detail\":\"Not found\"}";
                 break;

            case 404:
                System.out.println("POST request not worked");
                finalString="{\"status\":\"Error\", \"detail\":\"Not found\"}";

                break;

            case 500:
                System.out.println("POST request not worked");
                finalString="{\"status\":\"500\", \"detail\":\""+ con.getResponseMessage()+"\"}";
                break;

            default:
                System.out.println("POST request not worked");
                finalString="{\"status\":\"Error\",\"detail\":{\"id\":\"Null\"}}";
                break;
        }

        return finalString;

    }



}
