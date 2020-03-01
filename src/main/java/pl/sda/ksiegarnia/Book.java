package pl.sda.ksiegarnia;

public class Book {
    String name;
    Author author =new Author();
    Category category = new Category();

    public Book(String name, Author author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }
}
