//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Book book1 = new Book("DSA", "Shahbaz Akhtar",10.50);
        Book book2 = new Book("Java", "Shahid Bhatti",20,false);
        Book [] books = {book1,book2};

        Library library = new Library(books);
        library.displayBooks();
        library.borrowBook("DSA");
        library.displayBooks();
        library.borrowBook("DB");
    }
}