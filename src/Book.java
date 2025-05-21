public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    public String titleInUpperCase() {
        return title.toUpperCase();
    }

    public boolean isLongBook() {
        return pages > 300;
    }

    public int getReadingTime(int wordsPerMinute) {
        int totalWords = pages * 250;
        return totalWords / wordsPerMinute;
    }

    public boolean hasMorePagesThan(Book other) {
        return this.pages > other.pages;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the goblet of fire", "J.K Rowling", 636);
        Book book2 = new Book("1984", "George Orwell", 328);

        book1.displayInfo();
        System.out.println("Title in uppercase: " + book1.titleInUpperCase());
        System.out.println("Is it a long book? " + book1.isLongBook());

        int time = book1.getReadingTime(200);
        System.out.println("Estimated reading time: " + time + " minutes");

        System.out.println("Does book1 have more pages than book2? " + book1.hasMorePagesThan(book2));
    }
}
