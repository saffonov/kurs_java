import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Staffs {
    private static HashMap<Integer, String> staffMap = new HashMap<>();

    public static void loadFromFile(String fname) {
        try {
            File f = new File(fname);
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String StringInFile;
            int index = 0;
            while ((StringInFile = reader.readLine()) != null) {
//                StringInFile = reader.readLine();
                staffMap.put(index, StringInFile);
                index++;
//                System.out.println(StringInFile);
            }

            reader.close();
//            System.out.println("LOAD:");
//            System.out.println(staffMap);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findFreqName() {

        ArrayList <String> nameList = new ArrayList<>();

//        System.out.println(staffMap.values());
        Iterator iterator = staffMap.values().iterator();

        while (iterator.hasNext()){
            var tmp = iterator.next();
            String name = tmp.toString();
            int iSpase = name.indexOf(" ");
            name = name.substring(0, iSpase);

//            System.out.println(name);
            nameList.add(name);

        }

        Collections.sort(nameList);
        System.out.println(nameList);

        String tmpName = nameList.get(0);
        int fregName = 1;



        for(int i = 1; i< nameList.size(); i++){
            if (tmpName.equals(nameList.get(i))) fregName++;
            else {
                System.out.print(tmpName);
                System.out.println(" " +fregName);
                fregName = 1;
                tmpName = nameList.get(i);
            }

        }

        System.out.print(tmpName);
        System.out.println(" " +fregName);


//        Iterator itrNameList = nameList.listIterator();
//        var tmp = itrNameList.next();
//        String tmpName = tmp.toString();
//
//        while (itrNameList.hasNext()) {
//
//            if (itrNameList.next() != tmpName) {
//                System.out.println(Collections.frequency(tmpName, itrNameList.next()));
//            }
//            var tmp = itrNameList.next();
//            tmpName = tmp.toString();
//
//        }


//        System.out.println(nameList);
//        String[] NameArray;
//        nameList.toArray(NameArray);
////        var freq = Arrays.stream(NameArray).collect(Collectors.groupingBy(x ->x, Collectors.counting()));
//        System.out.println(NameArray);



    }


}
