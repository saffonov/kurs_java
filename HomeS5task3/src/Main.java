import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Random random = new Random();
        int n = 10;
        int Max = 10;
        int[] sortArr = new int[n];

        for (int i = 0; i < sortArr.length; i++){
            sortArr[i] = random.nextInt(Max);
        }
        System.out.println("Init array : " +Arrays.toString(sortArr));
        Heapsort.heapSort(sortArr);
        System.out.println("Sorted array : " +Arrays.toString(sortArr));

    }
}