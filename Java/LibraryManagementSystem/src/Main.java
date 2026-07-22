//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Book book1 = new Book("DSA", "Shahbaz Akhtar",10.50);
        Book book2 = new Book("Java", "Shahid Bhatti",20);
        Book book3 = new Book("DB", "Hamid Turab",9.00);
        Book book4 = new Book("AI", "Wajahat Qazi",30);

        Book book5 = new Book("DAA", "Aqsa",15.89);
        Book book6 = new Book("TBW", "Ayesha Atta",25);

        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.displayBooks();
        library.borrowBook("DSA");
        library.displayBooks();
        library.returnBook("DSA");
        library.displayBooks();

    }
}