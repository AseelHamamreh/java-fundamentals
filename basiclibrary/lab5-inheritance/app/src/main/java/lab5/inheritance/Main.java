package lab5.inheritance;

public class Main {
    public static void main (String [] args){
        System.out.println("Restaurant result : ");
        Restaurant kfc = new Restaurant("kfc", "Dollar");
        System.out.println("Restaurant before review: "+kfc.toString());
        Review AseelsReview = new Review ("Aseel","bad restaurant", 0.6);
        Review RawanReview = new Review ("Rawan","great restaurant", 4.5);
        kfc.newReview(AseelsReview);
        kfc.newReview(RawanReview);
        System.out.println("Restaurant After review: "+kfc.toString());

        System.out.println("");
        System.out.println("");


        System.out.println("Shop result: ");

        Shop saveWay = new Shop("saveWay","sell food and stuff", 4);
        System.out.println("shop before review: "+ saveWay.toString());
        Review NoorReview = new Review("Noor", "nice shop", 3.4);
        saveWay.newReview(NoorReview);
        System.out.println("shop after review: "+ saveWay.toString());

        System.out.println("");
        System.out.println("");


        System.out.println("Theater result: ");

        Theater theater1 = new Theater("theater1", "the godFather, seven");
        System.out.println("theater before review: "+ theater1.toString());
        Review review1 = new Review("Leen", "nice theater", 4.7,"Forest Gump");
        theater1.newReview(review1);
        theater1.addMovie("fight club");
        System.out.println("theater after review: "+ theater1.toString());
    }
}
