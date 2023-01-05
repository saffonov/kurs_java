import java.util.Stack;
import java.util.Iterator;

public class StackCalc {
    public static void Calc(Stack<String> stack) {

        
        Double operandA = 0.0;
        Double operandB = 0.0;
        Double result = 0.0;

        Boolean flag_continue_calc = false;

        // System.out.println("StackCalc: " +stack);
        Iterator<String> ich = stack.iterator();


    
        while(ich.hasNext()) {

            String c =  ich.next();
            // System.out.println("c = " +c);

            String b =  ich.next();
            // System.out.println("b = " +b);
            operandB = Double.parseDouble(b);
            

            if (flag_continue_calc) {
                operandA = result;
                
            } 
            else {
                String a =  ich.next();
                System.out.println("a = " +a);
                operandA = Double.parseDouble(String.valueOf(a));
                flag_continue_calc = true;                
            }              
           

            System.out.println("operandA = " +operandA);
            System.out.println("operandA = " +operandB);
            
            switch (c) {
                case "-":
                    result = (operandA - operandB);  
                    break;
                
                case "+":
                    result = (operandA + operandB);
                    break;

                case "*":
                    result = (operandA * operandB);                    
                    break;

                case "/":
                    result = (operandA / operandB);                    
                    break;

                case "~":
                    System.out.print("UNDO");
                    break;
            
                default:
                    System.out.print("Not calculate");
                    break;
                }
            System.out.println(result);
                 
        }

    }
 
}
