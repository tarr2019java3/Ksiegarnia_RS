package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

    public class JSONUtils {

        ObjectMapper objectMapper = new ObjectMapper();

        public void writeList(String fileName, List<Book> book) {
            try {
                objectMapper.writeValue(new File(fileName), book);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void readList(String filename) {

            ObjectMapper objectMapper = new ObjectMapper();

            try {
                Book [] book = objectMapper.readValue(new File(filename), Book[].class);
                for (Book boo: book) {
                    System.out.println("____________________________");
                    System.out.println( "Tilte:  " + boo.getName() + "  " +  " | Author: " + boo.getAuthor().getLastname() + ",  " + boo.getAuthor().getName() + "  " + "| Category:  " +  boo.getCategory().getName());
                    System.out.println("___________________________ ");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


