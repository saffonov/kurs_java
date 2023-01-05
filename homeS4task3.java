// 3. В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class homeS4task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a calculation: ");
        String str = in.nextLine();
        in.close();

        // Check for leters in string
        boolean allLetters = str.matches("(?i).*[a-zа-я].*") || str.matches("[^0-9a-zA-Zа-яА-Я]+");

        if (allLetters) {  
            System.out.print("ERROR in Expression");
            System.exit(0);           
        }

       

        Stack<String> stack = new Stack<String>();

        String[] strArray = str.split(" ");
        // Arrays.asList(strArray).stream().forEach(s -> System.out.println(s));
        // Arrays.asList(strArray).stream().forEach(s -> stack.push(s));
        for(int i = 0; i < strArray.length; i++){ stack.push(strArray[i]);}

        System.out.print(stack);

        StackCalc.Calc(stack);
    

    
        // вычисление
        // откат @undo
        
    }
    
}
