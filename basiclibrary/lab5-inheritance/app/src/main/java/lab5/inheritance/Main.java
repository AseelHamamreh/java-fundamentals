package lab5.inheritance;

public class Main {
    public static void main (String [] args){
        Restaurant kfc = new Restaurant("kfc", "Dollar");
        System.out.println("Restaurant before review: "+kfc.toString());
        Review KFCReview = new Review ("Aseel","bad restaurant", 3.7);
        kfc.newReview(KFCReview);
        System.out.println("Restaurant After review: "+kfc.toString());
    }
}
