import java.util.*;

public class Main {
  public static void main(String[] args) {
    String welcomeMsg = "Welcome To Lab 2 Solution";
    int[] newArray ={4,2,5,7,9,4,1};
    System.out.println(welcomeMsg);   
    roll (4); 
    containsDuplicates(newArray);
    Averages(newArray);
    ArrOfArr();

  }

  public static ArrayList roll  (int n) {
    System.out.println("************ roll  Function output:************");
    Random random = new Random();
    int max =6;
    int min =1;
    int result;
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for(int i = 0; i<n;i++){
        myArray.add(random.nextInt(max - min + 1) + min);
    }
    System.out.println(myArray);
    return myArray;
  }

  public static boolean containsDuplicates (int[] duplicateArray){
      System.out.println("************ containsDuplicates  Function output:************");
      for (int i = 0; i < duplicateArray.length; i++) {
          for(int j=0 ; i<duplicateArray.length;j++){
              if(i != j){
                  if(duplicateArray[i]==duplicateArray[j]){
                      System.out.println("true");
                      return true;
                  }
              }
          }
      }
      System.out.println("false");
      return false;
  }

  public static double Averages (int[] newArray){
      System.out.println("************ Averages  Function output:************");
      System.out.println("Array:" + Arrays.toString(newArray));
      int sum=0;
      for(int i = 0; i<newArray.length;i++){
          sum+=newArray[i];
      }
      double avg = sum / (newArray.length);
      System.out.println("Avarege = "+ avg);
      return avg;
  }

  public static double ArrOfArr(){
    System.out.println("************ Array Of Arrays  Function output:************");
    int[][] weeklyMonthTemperatures = {
      {66, 64, 58, 65, 71, 57, 60},
      {57, 65, 65, 70, 72, 65, 51},
      {55, 54, 60, 53, 59, 57, 61},
      {65, 56, 55, 52, 55, 62, 57}
    };
    int sum = 0;
    int myLength =0;
    double minAvg =10000;
    double avg=0;
    for(int i = 0; i<weeklyMonthTemperatures.length; i++){
        for(int j = 0; j< weeklyMonthTemperatures.length;j++){
            sum+=weeklyMonthTemperatures[i][j];
            myLength+=1;
        }
        avg = sum/myLength;
        if (avg < minAvg){
            minAvg=avg;
        }
        if(i== (weeklyMonthTemperatures.length)-1){
        System.out.println("minimum Averege: "+ minAvg);
        return avg;
        }
    }
    return avg;
  }
  
}

