public class Book {
    String name;
    Author author;
    double price;
    int qty;

public Book(String name, Author author, double price, int qty){
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
}

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int newQty){
        this.qty = newQty;
    }
}
