class book{
    String title;
    String Author;
    double price;

    book(){ // default constructor
        this.title = "unknown";
        this.Author = "unknown";
        double price = 0.0;
    };

    book(String title , String Author , double price){
        this.title = title;
        this.Author = Author;
        this.price = price;
    }
    void Display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + Author);
        System.out.println("Price: $" + price);
    }
}

public class q1 {
    public static void main(String[] args){
        book b1 = new book();
        b1.Display();

        book b2 = new book("The Last Rides" , "Aurubindo" ,78);
        b2.Display();
    }
}
