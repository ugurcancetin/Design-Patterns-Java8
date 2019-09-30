import java.util.Date;

public class Book {
    private long numberOfCopies;
    private String author;
    private String title;
    private Date publicationDate;


    public long getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(long numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    void info(){
        System.out.println("Title : " + this.title + "/n" +
                "Author : " + this.author +"/n" +
                "Publication Date : " + this.publicationDate +"/n" +
                "numberOfCopies : " +this.numberOfCopies);
    }
}
