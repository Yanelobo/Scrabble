import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Scrabble {
    static HashMap<String, Integer> values = new HashMap<>();

    static {
        String[] charsWithValue1 = {"A", "E", "I", "O", "U", "L", "N", "S", "T", "R"};
        String[] charsWithValue2 = {"D", "G"};
        String[] charsWithValue3 = {"B", "C", "M", "P"};
        String[] charsWithValue4 = {"F", "H", "V", "W", "Y"};
        String[] charsWithValue8 = {"J", "X"};
        String[] charsWithValue10 = {"Q", "Z"};
        values.put("K", 5);


        for(String c: charsWithValue1) {
            values.put(c, 1);
        }

        for(String c: charsWithValue2){
            values.put(c, 2);
        }

        for(String c: charsWithValue3){
            values.put(c, 3);
        }

        for(String c: charsWithValue4){
            values.put(c, 4);
        }

        for(String c: charsWithValue8){
            values.put(c, 8);
        }

        for(String c: charsWithValue10){
            values.put(c, 10);
        }
    }
    public static int calculateScore(@NotNull String word) {
        int score = 0;
        char[] newWord = word.toUpperCase().toCharArray();
        for (char c: newWord) {
            score += values.get(String.valueOf(c));
        }
        return score;
    }

    public static void main(String[] args){
    int score = calculateScore("Testing");
    System.out.println("Your score is: " + score);
    }
}
