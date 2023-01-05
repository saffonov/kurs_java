// 3. В калькулятор добавьте возможность отменить последнюю операцию.

// + 4 5  = 9.0
// + 4 5 - 98 = -89.0
// + 4 5 -89 undo = 9.0

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.ListIterator;



public class App {
    public static void main(String[] args) throws Exception {

        Stack<String> stack = new Stack<String>();

        Scanner menu = new Scanner(System.in);
        System.out.println("Command: calc, exit, undo  ");
        String menu_str = "calc";

        for(;;)
        {
          
            System.out.print("enter a selection: ");
            menu_str = menu.nextLine();
            // menu.close();
        
            switch (menu_str) {
                case "calc":{      
                    // Scanner in = new Scanner(System.in);
                    System.out.print("Input a calculation: ");
                    String str = menu.nextLine();
                    // in.close();

                    // Check for leters in string
                    boolean allLetters = str.matches("(?i).*[a-zа-я].*") || str.matches("[^0-9a-zA-Zа-яА-Я]+");

                    if (allLetters) {  
                        System.out.print("ERROR in Expression");
                        // System.exit(0);   
                        break;        
                    }

                    
                    String[] strArray = str.split(" ");
                    for(int i = 0; i < strArray.length; i++){ stack.push(strArray[i]);} 
                    StackCalc.Calc(stack);
                }
                    break;

                case "exit": {
                    menu.close();
                    System.exit(0);
                }
                    break;

                case "undo": {
                    System.out.println("UNDO");
                    System.out.println(stack);
                    stack.pop();
                    stack.pop();
                    System.out.println(stack);
                    StackCalc.Calc(stack);


                }
                    break;        
        
                default: System.exit(0);
                    break;
            }
            
        }
        // menu.close();
    }
        
}
