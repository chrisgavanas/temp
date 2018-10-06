package exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExerciseFour {

    public static void main(String[] args) {
        List<Integer> list = createListWithTenIntegers();
        list.remove(2);     // Remove 3-th element which exists in index 2
        list.remove(5);     // Remove 7-th element which exists in index 6 but we have already removed an element from the initial list
    }

    /*
            We created a LinkedList because we need to remove elements from random index.
            ArrayList would need to shift the rest elements by 1 position
            e.g. ArrayList of 5 elements: 5 1 6 2 6
                Removing the 2nd element: 5 _ 6 2 6 <- The need to be shifted left by 1
                ArrayList after removing: 5 5 2 6 _
     */
    private static List<Integer> createListWithTenIntegers() {
        Random randomGenerator = new Random();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(randomGenerator.nextInt());
        }

        return list;
    }

}
