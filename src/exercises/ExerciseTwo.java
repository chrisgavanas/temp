package exercises;

import java.util.LinkedList;
import java.util.List;

public class ExerciseTwo {

    public static void main(String[] args) {
        List<Double> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.random());
        }
    }

}
