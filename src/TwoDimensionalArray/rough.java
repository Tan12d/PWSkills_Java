package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(10, 90, 80, 65, 36);

        List<Integer> filteredList =n.stream().filter(i -> i%2==0).toList();

        System.out.println(filteredList);
    }
}
