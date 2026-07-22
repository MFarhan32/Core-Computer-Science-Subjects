public class Library {
    Book[] books;
    int count;
    Library(int size){
        books = new Book[size];
        count=0;
    }

    public void addBook(Book book){
        if(count<books.length){
             books[count]=book;
            System.out.println(book.getTitle()+" book added successfully.");
             count++;
        }
        else{
            System.out.println("Library is FULL.");
        }
    }
    public void borrowBook(String title){
        for (Book book : books){
            if(book.getTitle() == title && book.getAvailable()==true){
                book.setAvailable(false);
                System.out.println("Book Issued Successfully.");
                return;
            }
            else if(book.getTitle() == title && book.getAvailable()==false){
                System.out.println(book.getTitle()+" book is already Issued.");
                return;
            }
        }
        System.out.println("Book is not available in the Library.");
    }


    public void returnBook(String title){
        for (Book book : books){
            if(book.getTitle() == title && book.getAvailable()==false){
                book.setAvailable(true);
                System.out.println("Book returned Successfully.");
                return;
            }
        }
    }
    public void displayBooks(){
        for (Book book : books){
            if(book!=null){
            System.out.println(book);}
            else{
                continue;
            }
        }
    }

}
