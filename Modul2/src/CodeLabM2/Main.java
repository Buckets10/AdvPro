package CodeLabM2;

// Move Method
class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.2, 50);
        Library lib = new Library(book1, "Perpustakaan Kota");

        // Display initial information
        System.out.println("--- Informasi Awal ---");
        lib.showLibraryInfo();

        // Used a setter to modify the stock
        book1.setStock(book1.getStock() + 5);

        // Display updated information
        System.out.println("\n--- Informasi Setelah Update ---");
        lib.showLibraryInfo();
    }
}
