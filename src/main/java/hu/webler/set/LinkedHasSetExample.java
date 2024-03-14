package hu.webler.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
