public class Book {
    //properties
    private String name;
    private Author author;
    private double price;
    private int qty;

    //constructors
    public Book(String userName, Author userAuthor, double userPrice, int userQTY){
        name = userName;
        price = userPrice;
        qty = userQTY;
        author = userAuthor;
    }

    //methods
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        return "'" + name + "' by " + author.toString();

    }






}
