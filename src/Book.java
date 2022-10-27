public class Book {
    private String name;
    private String author;
    private int yearOfThePublication;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.yearOfThePublication = year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfThePublication() {
        return this.yearOfThePublication;
    }

    public void setYearOfThePublication(int year) {
        this.yearOfThePublication = year;
    }
}
