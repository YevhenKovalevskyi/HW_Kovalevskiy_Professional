package com.cbsystematics.homeworks.hw11.taskExtra.services;

import com.cbsystematics.homeworks.hw11.taskExtra.dto.Animals;
import com.cbsystematics.homeworks.hw11.taskExtra.dto.Cat;
import com.cbsystematics.homeworks.hw11.taskExtra.dto.Cats;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.nio.file.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
    public static String getDataForFile() {
        HashMap<String,String> cat1 = new HashMap<>(4);
        HashMap<String,String> cat2 = new HashMap<>(4);
        HashMap<String,String> cat3 = new HashMap<>(4);
        
        cat1.put("name", "Marsel");
        cat1.put("age", "7");
        cat1.put("breed", "Sphynx");
        cat1.put("weight", "6");
    
        cat2.put("name", "Myrzik");
        cat2.put("age", "5");
        cat2.put("breed", "Oriental");
        cat2.put("weight", "4");
    
        cat3.put("name", "Tom");
        cat3.put("age", "7");
        cat3.put("breed", "Bengal");
        cat3.put("weight", "6");
        
        StringBuilder xmlData = new StringBuilder(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<animals>\n" +
                "*<cats>\n");
        
        for (HashMap<String, String> cat: Arrays.asList(cat1, cat2, cat3)) {
            xmlData.append(
                    "**<cat>\n" +
                    "***<name>" + cat.get("name") + "</name>\n" +
                    "***<age>" + cat.get("age") + "</age>\n" +
                    "***<breed>" + cat.get("breed") + "</breed>\n" +
                    "***<weight>" + cat.get("weight") + "</weight>\n" +
                    "**</cat>\n"
            );
        }
        
        xmlData.append(
                "*</cats>\n" +
                "</animals>"
        );
        
        return xmlData.toString().replace("*", "\t");
    }
    
    /**
     * The method takes String data and saves it to a file.
     *
     * @param fileData - file data
     * @param filePath - file path
     * @return save result
     */
    public static String saveDataToFile(String fileData, String filePath) throws IOException {
        if (fileData.length() == 0) {
            return "XML data is empty!";
        } else if (filePath.length() == 0) {
            return "File path is empty!";
        }
        
        Path pathToFile = Paths.get(filePath);
        
        if (!Files.exists(pathToFile, LinkOption.NOFOLLOW_LINKS)) {
            Files.createFile(pathToFile);
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(fileData);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return "Data successfully saved!";
    }
    
    /**
     * The method reads and prints data from a file using StAX.
     *
     * @param filePath - file path
     * @param parent parent node
     */
    public static void readDataFromFileStAX(String filePath, String parent) {
        try {
            Path pathToFile = Paths.get(filePath);
            
            if (!Files.exists(pathToFile)) {
                throw new NoSuchFileException(filePath + " does not exist!");
            }
            
            InputStream fileStream = Files.newInputStream(pathToFile);
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(fileStream);
    
            int xmlEnd = XMLEvent.END_ELEMENT;
            int xmlStart = XMLEvent.START_ELEMENT;
            List<String> fields = Arrays.asList("name", "age", "breed", "weight");
            
            while (reader.hasNext()) {
                int next = reader.next();
                
                if ((next == xmlEnd || next == xmlStart) && parent.equals(reader.getLocalName())) {
                    System.out.println("----------------");
                } else if (next == xmlStart && fields.contains(reader.getLocalName())) {
                    System.out.println(reader.getName() + " -> " + reader.getElementText());
                }
            }
    
            reader.close();
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * The method reads and prints data from a file using JAXB.
     *
     * @param filePath - file path
     */
    public static void readDataFromFileJAXB(String filePath) {
        try {
            Path pathToFile = Paths.get(filePath);
    
            if (!Files.exists(pathToFile)) {
                throw new NoSuchFileException(filePath + " does not exist!");
            }
            
            InputStream fileStream = Files.newInputStream(pathToFile);

            JAXBContext context = JAXBContext.newInstance(Animals.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            
            Animals animals = (Animals) unmarshaller.unmarshal(fileStream);

            for (Cats cats : animals.getAnimals()) {
                for (Cat cat : cats.getCats()) {
                    System.out.println(cat);
                }
            }
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
