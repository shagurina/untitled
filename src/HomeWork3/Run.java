package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Apple[] apples = new Apple[10];
        ArrayList<Apple> applesList = new ArrayList<>(10);

        Apple apple0 = new Apple(1f);
        Apple apple1 = new Apple(1f);
        Apple apple2 = new Apple(1f);
        Apple apple3 = new Apple(1f);
        Apple apple4 = new Apple(1f);
        Apple apple5 = new Apple(1f);

        apples[0]  = apple0;
        apples[1]  = apple1;
        apples[2]  = apple2;
        apples[3]  = apple3;
        apples[4]  = apple4;
        apples[5]  = apple5;
        applesList.add(apple0);
        applesList.add(apple1);
        applesList.add(apple2);
        applesList.add(apple3);
        applesList.add(apple4);
        applesList.add(apple5);
        Box<Apple> box1 = new Box<>(apples,applesList);

        Apple[] apples2 = new Apple[10];
        ArrayList<Apple> applesList2 = new ArrayList<>(10);

        Apple apples3 = new Apple(1f);
        apples2[0]  = apple0;
        apples2[1]  = apple1;
        apples2[2]  = apple2;
        apples2[3]  = apple3;
        applesList2.add(apple0);
        applesList2.add(apple1);
        applesList2.add(apple2);
        applesList2.add(apple3);
        applesList2.add(apple4);
        applesList2.add(apple5);
        Box<Apple> box2 = new Box<>(apples2,applesList2);

        Orange[] oranges = new Orange[10];
        ArrayList<Orange> orangesList1 = new ArrayList<>(10);

        Orange orange0 = new Orange(1.5f);
        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3 = new Orange(1.5f);
        oranges[0]  = orange0;
        oranges[1]  = orange1;
        oranges[2]  = orange2;
        oranges[3]  = orange3;
        orangesList1.add(orange0);
        orangesList1.add(orange1);
        orangesList1.add(orange2);
        orangesList1.add(orange3);

        Box<Orange> box3 = new Box<>(oranges, orangesList1);
        box1.compare(box3);

        System.out.println(box1.getBoxArray());
        System.out.println(box2.getBoxArray());
        System.out.println(box3.getBoxArray());
     //   System.out.println(box2.getBoxList());

        System.out.println(box1.compare(box2));
        System.out.println(box1.compare(box3));
     //   System.out.println(box1.compareList(box2));

        box1.toEmptyArray(box2);
      //  box1.toEmptyList(box2);

        System.out.println(box2);




    }
}
