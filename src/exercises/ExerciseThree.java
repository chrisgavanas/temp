package exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExerciseThree {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(randomGenerator.nextInt());
        }
    }

}
