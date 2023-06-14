package Contest2.java;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMarks2 {

    static String[] sortStudents(String[] inputArray){
        Arrays.sort(inputArray, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               int score1 = Integer.parseInt(s1.substring(s1.length() -2));
                int score2 = Integer.parseInt(s2.substring(s2.length() - 2));
                if (score1 == score2) {
                    return 0;
                } else if (score1 < score2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return inputArray;
    }
    public static void main(String[] args) {
        String[] inputArray = {"harsh95", "john85", "alex95", "emma90", "sara88"};
        String[] sortedArray = sortStudents(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}
