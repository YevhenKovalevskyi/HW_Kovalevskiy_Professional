package com.cbsystematics.homeworks.hw12.taskExtra;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    
    public static void main(String[] args) throws IOException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        InputStream inputStream = new URL(url).openStream();
        
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String str;
            StringBuilder stringBuilder = new StringBuilder();
    
            while ((str = bufferedReader.readLine()) != null) {
                stringBuilder.append(str);
            }

            new JsonParser().parse(stringBuilder.toString()).getAsJsonArray().forEach(item -> {
                JsonObject obj = item.getAsJsonObject();
                System.out.printf("%s(%s): %s UAH\n",
                        obj.get("txt").toString().replace("\"", ""),
                        obj.get("cc").toString().replace("\"", ""),
                        obj.get("rate")
                );
            });
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

/*
 - можно вывести и 3 валюты, как в условии
   new JsonParser().parse(stringBuilder.toString()).getAsJsonArray().get(int i)
*/