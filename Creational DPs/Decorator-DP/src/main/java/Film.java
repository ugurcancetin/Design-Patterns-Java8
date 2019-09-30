import java.util.Date;

public class Film {
    private String director;
    private String title;
    private long playTime;
    private long numberOfCopies;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }

    public long getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(long numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    void info(){
        System.out.println("Film{" +
                "director='" + director + '\'' +
                ", title='" + title + '\'' +
                ", playTime=" + playTime +
                ", numberOfCopies=" + numberOfCopies +
                '}');
    }
}
