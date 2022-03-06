package HomeWork4;

import java.util.*;

public class  HomeWork4 {

    public static ArrayList<String> arrayList;

    public static void main(String[] args) {


        //Создание листа  с повторениями

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Pomegranate");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Pear");
        fruitList.add("Lemon");
        fruitList.add("Orange");
        fruitList.add("Plum");
        fruitList.add("Mango");
        fruitList.add("Mango");
        System.out.println("Initial list: " + fruitList);


        //Вывод уникальных слов

        Set<String> fruitHashSet = new HashSet(fruitList);
        System.out.println("Unique: " + fruitHashSet);
        String[] fruitArray = fruitHashSet.toArray(new String[fruitList.size()]);

        //Вызов метода по подсчету повторения указанного слова в листе
        getUnique(fruitList, "Mango" );



    }




    public static <String > void  getUnique(ArrayList<String> ArrayList, String str) {

        Integer  count = 0;
        for (String strThis : ArrayList) {

            if (strThis.equals(str))
                count++;

        }
        System.out.println("Unique: " + count);

    }




}
