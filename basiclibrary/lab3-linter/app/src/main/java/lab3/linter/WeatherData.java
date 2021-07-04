package lab3.linter;

import java.util.Collections;
import java.util.*;

public class WeatherData {

    void handleArray (){
        int[][] inputArray = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int min= inputArray[0][0];
        int max= inputArray[0][0];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                if(max < inputArray[i][j]){
                    max = inputArray[i][j];
                } else if(min > inputArray[i][j]){
                    min = inputArray[i][j];
                }
            }
        }
        System.out.println("High: "+max);
        System.out.println("Low: "+min);

        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i=0;i<inputArray.length;i++){
            for (Integer temp : inputArray[i]) {
                unique.add(temp);
            }
        }
        for (int i = Collections.min(unique); i < Collections.max(unique); i++) {
            if (!unique.contains(i)) {
                System.out.println("Never saw temperature: " + i);

            }
        }
    }


}
