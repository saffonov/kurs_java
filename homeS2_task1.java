// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


// cur.execute('''SELECT * FROM Contact WHERE (ItemFIO = ?) 
// OR (ItemName = ?)
// OR (ItemSname = ?)
// OR (ItemTel = ?)                                           
// ''', (fio, name, sname, tel))

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;


public class homeS2task1 {
    public static void main(String[] args) {
        try {
            String requestSQL = "SELECT * FROM students WHERE ";

            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/filter_string.json");
            File f = new File(pathFile);

            BufferedReader reader = new BufferedReader(new FileReader(f));
            String filterStringInFile = reader.readLine();
            reader.close();

            JSONObject filterJsonObject = new JSONObject(filterStringInFile);
            JSONArray filteJsonArray = filterJsonObject.optJSONArray(filterStringInFile);

            // System.out.println(filterStringInFile);
            System.out.println(filteJsonArray);

            while (filteJsonArray.) {
                
            }



        } 
        catch (Exception e) { System.out.println("catch");}
        finally { System.out.println("finally"); }
    }
}
