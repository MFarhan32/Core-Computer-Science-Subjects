public class Library {
    Book[] books;

    Library(Book[] book){
        this.books = book;
    }

//    public void addBook(Book books){
//
//    }
    public void borrowBook(String title){
        for (Book book : books){
            if(book.getTitle() == title && book.getAvailable()==true){
                book.setAvailable(false);
                System.out.println("Book Issued Successfully.");
                return;
            }
            else if(book.getTitle() == title && book.getAvailable()==false){
                System.out.println("Book is already Issued.");
                return;
            }
        }
        System.out.println("Book is not available in the Library.");
    }
//    public void returnBook(titlel){
//
//    }
    public void displayBooks(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

}
