//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Book book1 = new Book("DSA", "Shahbaz Akhtar",10.50);
        Book [] books = {book1};

        Library library = new Library(books);
        library.displayBooks();
    }
}