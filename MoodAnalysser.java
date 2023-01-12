package classProblemByAmolMateSir.Day21PracticeProblem;

import java.util.Random;

public class MoodAnalysser {
    public static void main(String[] args) {
        try {
            MoodAnalysser.analysyseMood();
        } catch (Exception e) {
            System.out.println("massage mood is sad");        }
    }

    private static boolean analysyseMood() {
        Random random = new Random();
        int myMood = random.nextInt(2);
        boolean flag = true;
        if (myMood == 1) {
            System.out.println("Happy Mood");
            flag = true;
        } else {
            System.out.println("Sad Mood");
        }
        return false;
    }
}
