package CrashCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindPlayersZeroOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> wins = new HashMap<>();
        HashMap<Integer, Integer> losses = new HashMap<>();

        for (int[] game : matches) {
            wins.put(game[0], wins.getOrDefault(game[0], 0) + 1);
            losses.put(game[1], losses.getOrDefault(game[1], 0) + 1);
        }

//        System.out.println("Wins: " + wins);
//        System.out.println("Loss: " + losses);

        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> playersnolosses = new ArrayList<>();
        List<Integer> playeroneloss = new ArrayList<>();


        for (int i : wins.keySet()) {
            if (!losses.containsKey(i)) {
                playersnolosses.add(i);
            }
        }
        for (int i : losses.keySet()) {
            if (losses.get(i) == 1) {
                playeroneloss.add(i);
            }
        }

        Collections.sort(playersnolosses);
        Collections.sort(playeroneloss);
        listOfLists.add(playersnolosses);
        listOfLists.add(playeroneloss);


        return listOfLists;
    }


    public static void main(String[] args) {
        FindPlayersZeroOneLosses f = new FindPlayersZeroOneLosses();
        int[][] matches1 = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(f.findWinners(matches1));
        int[][] matches2 = {{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        System.out.println(f.findWinners(matches2));
    }
}
