// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Iterator;

import GetRandomCollection.getRND;


public class homeS3task3 {
    public static void main(String[] args) {
        int n = 10;
        int Max = 10;
        ArrayList<Integer> RND = GenRandomCollection.getRND(n, Max);

        System.out.println("Исходная последовательность:");
        System.out.println(RND);

        RND.sort(Comparator.naturalOrder());
        System.out.println("Min:" +RND.get(0));
        System.out.println("Max:" +RND.get(RND.size()- 1));
        int medium = 0;

        for (Iterator<Integer> iterator = RND.iterator(); iterator.hasNext();) {
            medium += iterator.next();
        }
             
        float fMedium = (float) medium/ (float) RND.size();
        System.out.format("Midle: %.3f", fMedium);
    }
    
}
