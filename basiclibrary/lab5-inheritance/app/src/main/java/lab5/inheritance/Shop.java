package lab5.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop implements ReviewInterface {
    private String name ;
    private String description;
    private int numOfDollarSigns;
    private ArrayList<Review> myReviews;

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
        this.myReviews = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumOfDollarSigns(int numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    @Override
    public void newReview(Review newReview) {
        myReviews.add(newReview);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                ", myReviews=" + myReviews +
                '}';
    }
}
