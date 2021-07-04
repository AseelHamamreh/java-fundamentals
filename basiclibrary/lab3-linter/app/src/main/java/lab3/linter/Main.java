package lab3.linter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        WeatherData weatherClass = new WeatherData();
        weatherClass.handleArray();

        TallyingElection test = new TallyingElection();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = TallyingElection.tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}
