// Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

import GetRandomCollection.getRND;
import SortAlg.mergeSort;

public class homeS3task1 {
    public static void main(String[] args) {
        int n = 10;
        int Max = 10;
        // ArrayList<Integer> RND = new ArrayList<Integer>(0);
        ArrayList<Integer> RND = GenRandomCollection.getRND(n, Max);

        System.out.println("Исходная последовательность:");
        System.out.println(RND);

        RND.sort(Comparator.naturalOrder());
        System.out.println("Эталонная сортировка последовательности:");
        System.out.println(RND);

        // int[] DeSortRNDArray = RND.toArray(int[] );
        
        int[] DeSortRNDArray = RND.stream().mapToInt(i -> i).toArray();

        int[] SortArray = SortAlg.mergeSort(DeSortRNDArray);
        System.out.println("Отсортированая последовательность:");
        for (int i=0; i < SortArray.length; i++) {
            System.out.print(" " +SortArray[i]); 
        } 
        System.out.println();  

    }



  
    
}
