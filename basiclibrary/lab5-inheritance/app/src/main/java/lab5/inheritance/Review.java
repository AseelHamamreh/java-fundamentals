package lab5.inheritance;

public class Review {

    private String author;
    private String body;
    private double stars;

    public Review( String author, String body, double stars) {
        this.author=author;
        this.body=body;
        this.stars = setStars(stars);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getStars() {
        return stars;
    }

    public double setStars(double stars) {
        if(stars > 5 || stars <0){
            return 0.0d;
        }
        else{
            return stars;
        }
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                '}';
    }
}
