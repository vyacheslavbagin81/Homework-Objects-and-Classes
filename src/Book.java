public class Book {
    private String title;
    private Author name;
    private int yearOfPublication;

    public Book(String title, Author name, int yearOfPublication) {
        this.title = title;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getName() {
        return this.name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
