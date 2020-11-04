package com.cbsystematics.homeworks.hw11.task2.services;

import com.cbsystematics.homeworks.hw11.task2.dto.City;
import com.cbsystematics.homeworks.hw11.task2.dto.Streets;
import com.cbsystematics.homeworks.hw11.task2.dto.Street;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;

import java.util.Arrays;

/**
 * FilesService Class represents a service class for working with files
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class FilesService {
    
    /**
     * The method forms data for XML file.
     *
     * @return xml data
     */
    public static Object getDataFromDTO() {
        Street street1 = new Street("Borshchahivska St.", 423, "1.5 km");
        Street street2 = new Street("Akademika Yanhelya St.", 20, "500 m");
        Street street3 = new Street("Lvivska St.", 120, "800 m");
        Street street4 = new Street("Deputatska St.", 80, "700 m");
    
        street1.setSize("big");
        
        Streets streets = new Streets();
        streets.setStreets(Arrays.asList(street1, street2, street3, street4));
        
        City city = new City();
        city.setCity(Arrays.asList(streets));
    
        return city;
    }
    
    /**
     * The method write data from DTO to a file using JAXB.
     *
     * @param filePath - file path
     */
    public static String writeDataFromDTOJAXB(String filePath) {
        Object dtoData = FilesService.getDataFromDTO();
        
        try {
            Path pathToFile = Paths.get(filePath);
    
            if (!Files.exists(pathToFile, LinkOption.NOFOLLOW_LINKS)) {
                Files.createFile(pathToFile);
            }
            
            OutputStream fileStream = Files.newOutputStream(pathToFile, StandardOpenOption.TRUNCATE_EXISTING);
            
            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(dtoData, fileStream);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    
        return "Data successfully saved!";
    }
}
