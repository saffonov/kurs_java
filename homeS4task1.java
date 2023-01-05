// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;


public class homeS4task1 {
    private static List ReverseList(List L) {
        Collections.reverse(L);
        return L;    
    }


    public static void main(String[] args) {
        int n = 10;
        int Max = 10;
        List<Integer> LL = GenRandomCollection.getRND(n, Max);

        System.out.println("Исходная последовательность:");
        System.out.println(LL);

        System.out.println("Перевернутая последовательность:");
        List<Integer> RLL = new LinkedList<Integer>();
        RLL = ReverseList(LL); 
        System.out.println(RLL);    
    }

}
