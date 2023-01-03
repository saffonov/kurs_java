// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Iterator;

import GetRandomCollection.getRND;


public class homeS3task2 {
    public static void main(String[] args) {
        int n = 10;
        int Max = 10;
        // ArrayList<Integer> RND = new ArrayList<Integer>(0);
        ArrayList<Integer> RND = GenRandomCollection.getRND(n, Max);

        System.out.println("Исходная последовательность:");
        System.out.println(RND);

        for (Iterator<Integer> iterator = RND.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        
        }
        System.out.println("Последователность с удаленными четьными числами: ");
        System.out.println(RND);


    }
    
}
