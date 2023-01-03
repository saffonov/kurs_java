package gb_java;

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
import java.io.IOException;

import org.openjdk.nashorn.api.scripting.ClassFilter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        try {
            String requestSQL = "SELECT * FROM students WHERE ";

            String FileName = "/filter_string.json";
            

            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat(FileName);

            // System.out.println("Working Directory = " + System.getProperty("user.dir"));
            // System.out.println("Working file = " + pathFile);

           
            FileReader f = new FileReader(pathFile);
            BufferedReader reader = new BufferedReader(f);
            String filterStringInFile = reader.readLine();
            reader.close();
            System.out.println(filterStringInFile);


            

            JsonNode jsonFilterNode = objectMapper.readTree(filterStringInFile);
            
            // objectMapper.readValue(filterStringInFile, classFilters.class);
            

        } 
        catch (Exception e) { System.out.println("catch");}
        finally { System.out.println("finally"); }
    }

}
