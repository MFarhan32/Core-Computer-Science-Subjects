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

    public String getAvailable(){
        if(!available){
            return "Unavailable";
        }
        return "Available";

    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    public String toString(){
        return this.getTitle() + " (" + this.getAvailable()+ ")";
    }
}
