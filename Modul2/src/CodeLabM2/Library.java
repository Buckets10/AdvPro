package CodeLabM2;

class Library {
    // Encapsulate Field
    private Book book;
    private String location;

    public Library(Book book, String location) {
        this.book = book;
        this.location = location;
    }

    // Encapsulate Field
    public void setBook(Book newBook) {
        this.book = newBook;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    // Display library and book information
    public void showLibraryInfo() {
        System.out.println("Library Location: " + this.location);
        this.book.displayInfo();
    }
}

