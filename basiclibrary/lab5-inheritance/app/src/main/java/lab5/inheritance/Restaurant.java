package lab5.inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String priceCategory;
    private ArrayList<Review> myReviews;

    Restaurant(String name, String priceCategory){
        this.name=name;
        this.priceCategory=priceCategory;
        this.myReviews=new ArrayList<>();
    }

    public void newReview(Review newReview) {
        myReviews.add(newReview);
    }


//    setters functions:

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void setMyReviews(ArrayList<Review> myReviews) {
        this.myReviews = myReviews;
    }

    //    getters functions:


    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", myReviews=" + myReviews +
                '}';
    }
}
