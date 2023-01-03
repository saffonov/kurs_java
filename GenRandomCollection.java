import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Random;


public class GenRandomCollection {
    public static ArrayList getRND(int n, int Max) {
        ArrayList<Integer> RNDList = new ArrayList<Integer>(0);
        Random random = new Random();
        for (int i = 0; i <= n; i++){
            RNDList.add(random.nextInt(Max));
        }
        return RNDList;

        
    }
    
}
