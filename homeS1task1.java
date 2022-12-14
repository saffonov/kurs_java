// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/**
 * homeS1task1
 */

import java.util.Scanner;

public class homeS1task1 {

    public static int getFactorial(int f) {
        if (f <= 1) {
           return 1;
        }
        else {
           return f * getFactorial(f - 1);
        }
      }

    public static int getSum(int f) {
        int s = 0;
        for (int index = 0; index <= f; index++) {
            s = s + index;   
        }
        return s;

      }

    public static void main(String[] args) {
        int sum_n = 0;
        int fac_n = 0;

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        if (n > 19) {
            System.out.printf("Введно слишком большое число для факториала: %s \n", n);

        }
        else {
            fac_n = getFactorial(n);
        }

        System.out.printf("Введно: %s ", n);


        sum_n = getSum(n);
        

        System.out.printf("Сумма: %s ", sum_n);
        System.out.printf("Факториал: %s ", fac_n);
        
    }

    
}