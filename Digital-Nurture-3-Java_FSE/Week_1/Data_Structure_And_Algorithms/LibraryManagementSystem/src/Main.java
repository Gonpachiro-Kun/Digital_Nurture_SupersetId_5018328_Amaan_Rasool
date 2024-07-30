public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book(1, "And Then There Were None", "Agatha Cristie"));
        library.addBook(new Book(2, "Jungle Book", "Rudyard Kipling"));
        library.addBook(new Book(3, "Alice in Wonderland", "Lewis Carroll"));
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen"));

        System.out.println("All Books:");
        library.displayBooks();

        String searchTitle = "And Then There Were None";
        System.out.println("\nLinear Search for title \"" + searchTitle + "\":");
        Book foundBook = library.linearSearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        searchTitle = "Harry Potter";
        System.out.println("\nBinary Search for title \"" + searchTitle + "\":");
        foundBook = library.binarySearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
