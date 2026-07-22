public class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title,String author,double price,boolean available){
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
//    Overloaded constructor can be written as:
//    public Book(String title, String author, double price) {
//        this(title, author, price, true);
//    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public boolean getAvailable(){
        if(!available){
            return false;
        }
        return true;

    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    public String toString(){
        return this.getTitle() + " (" + this.getAvailable()+ ")";
    }
//    Better way
//    @Override
//    public String toString() {
//
//        return "Title : " + title +
//                "\nAuthor : " + author +
//                "\nPrice : " + price +
//                "\nStatus : " + (available ? "Available" : "Not Available");
//    }

}
