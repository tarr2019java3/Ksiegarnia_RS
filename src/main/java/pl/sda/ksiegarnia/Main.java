package pl.sda.ksiegarnia;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            Category category =new Category("Fantastyka");
            Category category1= new Category("Poezja Epicka");


            Author author = new Author("Terry", "Pratchett");
            Author author1 = new Author("Andrzej", "Sapkowski");
            Author author2 = new Author("Dante", "Alighieri");


            Book book = new Book("Straż! Straż!", author,category );
            Book book1 = new Book("Krew Elfów", author1, category );
            Book book2 = new Book("Divine Comedy", author2, category1);




            List<Book> booksList = new ArrayList<>();
            booksList.add(book);
            booksList.add(book1);
            booksList.add(book2);


            JSONUtils jsonUtils= new JSONUtils();
            jsonUtils.writeList("Spis_Książek.json", booksList);
            jsonUtils.readList("Spis_Książek.json");


        }
    }

