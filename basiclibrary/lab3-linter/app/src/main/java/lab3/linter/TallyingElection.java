package lab3.linter;

import java.util.Collections;
import java.util.*;

public class TallyingElection {
    public static String tally(List<String> votes){
        HashMap<String , Integer> myVotes = new HashMap<String , Integer>();
        int numOfVotes = 0 ;
        for(String myString : votes){
            if(myVotes.containsKey(myString)){
                numOfVotes = myVotes.get(myString) + 1;
                myVotes.put(myString , numOfVotes);
            }else{
                myVotes.put(myString , 1);
            }
        }
        int maxVotes = Collections.max(myVotes.values()) ;
        String winner = "none";
        for(Map.Entry<String , Integer> entry : myVotes.entrySet()){
            if(entry.getValue()== maxVotes){
                winner = entry.getKey();
            }
        }
        return winner;
    }
}
