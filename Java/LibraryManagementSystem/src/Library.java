public class Library {
    Book[] books;

    Library(Book[] book){
        this.books = book;
    }

//    public void addBook(Book books){
//
//    }
//    public void borrowBook(title){
//
//    }
//    public void returnBook(titlel){
//
//    }
    public void displayBooks(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }



}
