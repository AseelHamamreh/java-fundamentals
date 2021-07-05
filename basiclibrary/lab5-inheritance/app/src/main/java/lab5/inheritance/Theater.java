package lab5.inheritance;

import java.util.ArrayList;

public class Theater implements ReviewInterface {
    private String name;
    private String movies;
    private ArrayList <Review> myReviews;

    public Theater(String name, String movies) {
        this.name = name;
        this.movies = movies;
        this.myReviews = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public String getMovies() {
        return movies;
    }

    @Override
    public void newReview(Review newReview) {
        myReviews.add(newReview);
    }

    public void addMovie (String movieName){
        this.movies= this.movies+", "+ movieName;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' +
                ", myReviews=" + myReviews +
                '}';
    }
}
