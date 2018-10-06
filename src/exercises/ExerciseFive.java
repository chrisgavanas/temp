package exercises;

import java.util.LinkedList;
import java.util.List;

public class ExerciseFive {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.addAll(List.of("Six", "Seven", "Eight", "Nine", "Ten"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
