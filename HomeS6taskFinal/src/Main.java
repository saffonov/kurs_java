//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//2. Создать множество ноутбуков.
//3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notebooks notebook0 = new Notebooks ("Samsung", "M001", 2021, "i7", 64, 2, "red", 100000, 2);
        Notebooks notebook1 = new Notebooks ("Apple", "AA01", 2022, "i7", 64, 1, "red", 200000, 1);
        Notebooks notebook2 = new Notebooks ("Lenova", "L01", 2021, "i7", 64, 2, "red", 150000, 1);

        Set<Notebooks> notebookSet = new HashSet<>();
        notebookSet.add(notebook0);
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);

        Map<Integer, String> userConstrains = new HashMap<>();
        // Init user constrains by default
        userConstrains.put(1, "");
        userConstrains.put(2, "");
        userConstrains.put(3, "");
        userConstrains.put(4, "");
        userConstrains.put(5, "0");
        userConstrains.put(6, "0");
        userConstrains.put(7, "");
        userConstrains.put(8, "0");
        userConstrains.put(9, "0");

        Iterator iterNotebook = notebookSet.iterator();

        Scanner in = new Scanner(System.in);

        for(;;){
            System.out.println("Подбор ноутбука 0, Поиск - find, выход команда: exit");
            System.out.print("Input cmd: ");
            String strCmd = in.nextLine();
            if (strCmd.matches("exit")) {
                System.out.print("EXIT");
//                in.close();
                System.exit(0);
            }
            else if (strCmd.matches("0")) {
                System.out.println("Выберете парметр ноутбука");
                System.out.print("фирма производитель - 1 ");
                System.out.print("модель ноутбука - 2 ");
                System.out.print("год производства - 3 ");
                System.out.print("тип процессора - 4 ");
                System.out.print("обем озу в ГБайт - 5 ");
                System.out.print("вес Кг - 6 ");
                System.out.print("цвет - 7 ");
                System.out.print("цена руб - 8 ");
                System.out.println("гарантия год - 9 ");
                System.out.print("Введите команду: ");

                int intCmd = in.nextInt();
                String usrConstrain;

                switch (intCmd){
                    case 1 : {
                        System.out.println("фирма? : ");
                        usrConstrain = in.next();
                        userConstrains.put(1, usrConstrain);
                        System.out.print("Введена фирма:  " );
                        System.out.println(userConstrains.get(1));
                    }
                    break;
                    case 2 : {
                        System.out.println("модель ноутбука? : ");
                        usrConstrain = in.next();
                        userConstrains.put(2, usrConstrain);
                    }
                    break;
                    case 3 : {
                        System.out.println("год производства? : ");
                        usrConstrain = in.next();
                        userConstrains.put(3, usrConstrain);
                    }
                    break;
                    case 4 : {
                        System.out.println("тип процессора? :  ");
                        usrConstrain = in.next();
                        userConstrains.put(4, usrConstrain);
                    }
                    break;
                    case 5 : {
                        System.out.println("Минимальный обьем озу в ГБайт? : ");
                        usrConstrain = in.next();
                        userConstrains.put(5, usrConstrain);
                    }
                    break;
                    case 6 : {
                        System.out.println("Максимальный вес Кг? : ");
                        usrConstrain = in.next();
                        userConstrains.put(6, usrConstrain);
                    }
                    break;
                    case 7 : {
                        System.out.println("цвет? : ");
                        usrConstrain = in.next();
                        userConstrains.put(7, usrConstrain);
                    }
                    break;
                    case 8 : {
                        System.out.println("Максимальная цена руб? : ");
                        usrConstrain = in.next();
                        userConstrains.put(8, usrConstrain);
                    }
                    break;
                    case 9 : {
                        System.out.println(" Минимальных лет гарантии? : ");
                        usrConstrain = in.next();
                        userConstrains.put(9, usrConstrain);
                    }
                    break;
                    default:{
                        System.out.println("команда default ");
                    };
                }

            }
            else if (strCmd.matches("find")) {
                System.out.println("Screach : ");

                Notebooks notebookPattern = new Notebooks (
                        userConstrains.get(1),
                        userConstrains.get(2),
                        toIntwithEx(userConstrains.get(3)),
                        userConstrains.get(4),
                        toIntwithEx(userConstrains.get(5)),
                        toIntwithEx(userConstrains.get(6)),
                        userConstrains.get(7),
                        toIntwithEx(userConstrains.get(8)),
                        toIntwithEx(userConstrains.get(9))
                );
                System.out.println(notebookPattern);

                boolean flagNotFind = true;
                while (iterNotebook.hasNext()){
                    Object notebookTmp = iterNotebook.next();
                    boolean bfind = Objects.equals(notebookTmp, notebookPattern);
                    if (bfind) {
                        System.out.println("Fit :" + notebookTmp);
                        flagNotFind = false;
//                        System.out.println(flagNotFind);
                    }
                }
                if (flagNotFind) System.out.println("NOT FOUND");
                break;
            }
        }
    }

    private static int toIntwithEx(String args){
        try {
            Integer result = Integer.valueOf(args);
            return result;
        } catch (NumberFormatException e) {return 0;}
    }

//    private static void getNootebookSet() {
//        Notebooks notebook0 = new Notebooks ("Samsung", "M001", 2021, "i7", 64, 2, "red", 100000, 2);
//        Notebooks notebook1 = new Notebooks ("Apple", "AA01", 2022, "i7", 64, 1, "red", 200000, 1);
//        Notebooks notebook2 = new Notebooks ("Lenova", "L01", 2021, "i7", 64, 2, "red", 150000, 1);
//
//        Set<Object> notebookSet = new HashSet<>();
//        notebookSet.add(notebook0);
//        notebookSet.add(notebook1);
//        notebookSet.add(notebook2);
//        System.out.println(notebookSet);
//
//    }


}