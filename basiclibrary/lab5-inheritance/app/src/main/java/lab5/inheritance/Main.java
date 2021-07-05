package lab5.inheritance;

public class Main {
    public static void main (String [] args){
        Restaurant kfc = new Restaurant("kfc", "Dollar");
        System.out.println("Restaurant before review: "+kfc.toString());
        Review AseelsReview = new Review ("Aseel","bad restaurant", 9);
        Review RawanReview = new Review ("Rawan","great restaurant", 0.5);

        kfc.newReview(AseelsReview);
        kfc.newReview(RawanReview);
        System.out.println("Restaurant After review: "+kfc.toString());
    }
}
