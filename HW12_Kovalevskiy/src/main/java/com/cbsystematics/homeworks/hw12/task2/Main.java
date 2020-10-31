package com.cbsystematics.homeworks.hw12.task2;

import com.cbsystematics.homeworks.hw12.task2.helpers.FilesHelper;
import com.cbsystematics.homeworks.hw12.task2.services.JsonService;

import java.io.IOException;

/**
 * Main Class represents homework #12 #task2
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        // auto-generated JSON data(mockaroo)
        String json = "[{'id': 1,'country_name': 'China','city_name': 'Longtang','street_name': 'Muir','street_address': '3 Bashford Pass'},{'id': 2,'country_name': 'Nigeria','city_name': 'Onueke','street_name': 'Kensington','street_address': '475 Mandrake Crossing'},{'id': 3,'country_name': 'Portugal','city_name': 'Outeiro','street_name': 'Carey','street_address': '382 Golden Leaf Place'}]";
        String filePath = FilesHelper.getResourceRootFilePath(Main.class, "Main.class", "task2.json");
        String result = JsonService.setDataToJson(json, filePath);
        
        System.out.println(result);
    }
}
