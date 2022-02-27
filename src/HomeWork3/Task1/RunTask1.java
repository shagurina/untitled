package HomeWork3.Task1;

import java.util.Arrays;

public class RunTask1 {

    static Integer[] arrayInt = {1, 2, 3, 4, 5};
    static Float[] arrayFloat = {1.1f, 2.2f, 3.3f, 4.4f};

    public static void main(String[] args) {
        ChangeClass <Object> changeClass = new ChangeClass<>();



        System.out.println(Arrays.toString(changeClass.changeElements(arrayInt, 1, 4)));
        System.out.println(Arrays.toString(changeClass.changeElements(arrayFloat, 1, 3)));



    }


}
