public class Book {
    private String name;
    private String author;
    private int pageCount;

    // Constructor
    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Method to get book details
    public String getDetails() {
        return "Name: " + name + ", Author: " + author + ", Page Count: " + pageCount;
    }
}
