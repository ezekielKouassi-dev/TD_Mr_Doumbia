/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.td_mr_doumbia;

/**
 *
 * @author ezekielkouassi
 */
public class Book {

    private String title;
    private String author;
    private int pageNumber;
    private String isbn;
    
    public Book() {
        super();
    }
    
    public Book(String title, String author, int pageNumber, String isbn) {
        super();
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pageNumber=" + pageNumber + ", isbn=" + isbn + '}';
    }
    
    
     
}
