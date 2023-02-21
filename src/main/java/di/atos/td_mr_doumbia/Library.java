/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.td_mr_doumbia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezekielkouassi
 */
public class Library {

    // Collection de book
    private List<Book> books = new ArrayList<Book>();

    // Constructeur sans paramtère
    public Library() {
        super();
    }

    // Contructeur avec paramètre
    public Library(List<Book> books) {
        super();
        this.books = books;
    }

    // Methode d'ajout de book dans la bibliotheque
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Methode de suppression d'un book
    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void removeBook(String search_value) {

        // première méthode sans lambda
        //this.books.remove(this.searchBook(title));
        // Deuxième méthode avec lambda
        this.books.removeIf(book -> (book.getTitle().equalsIgnoreCase(search_value))
                || (book.getIsbn().equalsIgnoreCase(search_value)));
    }

    // Methode pour avoir la liste des books
    public List<Book> getAllBooks() {
        return this.books;
    }
    
    // Display List
    public void displayLibrary() {
        this.books.forEach(l -> {
            System.out.println(l.toString());
        });
    }

    // Methode pour rechercher un book
    public Book searchBook(String title) {
//        Book book = new Book();

        // en utilisant le foreach sans les streams
//        books.forEach(b -> {
//            if (b.getTitle().equals(title)) {
//                book.setTitle(b.getTitle());
//                book.setAuthor(b.getAuthor());
//                book.setPageNumber(b.getPageNumber());
//                book.setIsbn(b.getIsbn());
//            }
//        });
        // en utilisant les streams
//        books.stream().filter(b -> {
//            return b.getTitle().equals(title);
//        }).findFirst().get();
//        
        //return book;
        return books.stream().filter(b -> {
            return b.getTitle().equals(title);
        }).findFirst().get();

    }

}
