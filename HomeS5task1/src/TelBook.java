
import java.util.ArrayList;
import java.util.HashMap;


public class TelBook {

    private static HashMap<String, ArrayList<Integer>> telefonNumber = new HashMap<>();

    public void add (String name, Integer number) {
        if(telefonNumber.containsKey(name)) {
            telefonNumber.get(name).add(number);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(number);
            telefonNumber.put(name,values);
        }
    }

    public ArrayList<Integer> find(String name) {
        if(telefonNumber.containsKey(name)) {
            return telefonNumber.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> gettelefonNumber() {
        return telefonNumber;
    }
}
