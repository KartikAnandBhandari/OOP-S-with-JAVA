class Library {
    static class Book {
        private String title, author, isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Library.Book book = new Library.Book("Java Programming", "James Gosling", "123-456-789");
        book.displayDetails();
    }
}
