import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Main {
  public static void main(String[] args) {
    String welcomeMsg = "Welcome To Lab 1 Solution";
    System.out.println(welcomeMsg);   
    pluralize(); 
    flipNHeads(1);
    clock();
  }

  public static void pluralize () {
    System.out.println("************ pluralize Function output:************");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the animal name (cat,dog...etc).");
    String name = sc.nextLine();

    Scanner myNum = new Scanner(System.in);
    System.out.println("How many "+ name + " do you have?");
    int num = Integer.parseInt(sc.nextLine());

    sc.close();
    if(num == 0 || num>1){
      System.out.println("I own "+ num +" "+ name+"s.");
    }
    else{
      System.out.println("I own "+ num +" " +name+".");
    }
  }

  public static void flipNHeads (int n){
    System.out.println("************ flipNHeads Function output: ************");
    String coin;
    double start = 0;
    double end = 1;
    int numOfHeads = 0;
    Random rand = new Random();
    n= rand.nextInt((10 - 1) + 1) + 1;
    for(int i = 0 ; i<n ; i++){
      double random = new Random().nextDouble();
      double result = start + (random * (end - start));
      if (result >= 0.5){
        coin ="heads";
        numOfHeads+=1;
      }
      else{
        coin="tails";
      }
      System.out.println(coin);
    }
    System.out.println("It took "+n+" flips to flip "+numOfHeads+" head in a row.");
  }

  public static void clock (){
    System.out.println("************ clock Function output: ************");
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    
     try {
      while (true) {
        now=LocalDateTime.now();
        hour = now.getHour();
        minute = now.getMinute();
        second=now.getSecond();
        System.out.println(hour+":"+minute+":"+second);
        Thread.sleep(1000); 
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

