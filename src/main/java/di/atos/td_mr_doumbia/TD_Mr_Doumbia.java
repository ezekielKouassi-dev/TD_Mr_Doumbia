/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.td_mr_doumbia;

/**
 *
 * @author ezekielkouassi
 */
public class TD_Mr_Doumbia {

    public static void main(String[] args) {
        Library library = new Library();
        
        // Ajout des books dans la librairie
        library.addBook(new Book("livrre1", "autheur1", 123, "AZED"));
        library.addBook(new Book("livrre2", "autheur2", 23, "Asdf"));
        library.addBook(new Book("livrre3", "autheur3", 56, "AZcs"));
        library.addBook(new Book("livrre4", "autheur4", 157, "crz"));
        
        // rechercher un livre par son nom
        System.out.println(library.searchBook("livrre1").toString());
        
        System.out.println("=============");
        
        library.displayLibrary();
        
        System.out.println("==============");
        // supprimer un livre
        library.removeBook("crz");
        
        // afficher ma librairie
        library.displayLibrary();
        
    }
}
