//1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        personTelefoneNumber();
    }

        public static void personTelefoneNumber() {
            TelBook people = new TelBook();
            people.add("Васильев", 123456789);
            people.add("Петрова", 987654321);
            people.add("Иванов", 1212121212);
            people.add("Петрова", 232323232);
            people.add("Иванов", 454545455);

            System.out.println(people.find("Петрова"));
        }
}