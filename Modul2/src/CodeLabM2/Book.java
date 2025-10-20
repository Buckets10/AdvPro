package CodeLabM2;

class Book {
    // Encapsulate Field
    private String title;
    private String author;
    private double price;
    private int stock;

    // Introduce Constant - The discount value of 0.1 was changed into a constant named.
    public static final double DISCOUNT_RATE = 0.1;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Encapsulate Field - Getters and setters were added for each variable.
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int newStock) {
        this.stock = newStock;
    }

    // Extract Method - The logic for calculating the discount price was moved to a new method.
    public double calculateDiscount() {
        return getPrice() - (getPrice() * DISCOUNT_RATE);
    }

    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + getStock());
    }
}
