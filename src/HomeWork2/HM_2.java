package HomeWork2;

public class HM_2 {

    public static void main(String[] args) {

        // Массив с неправильным размером
        String[][] array1 = new String[2][2];
        array1[0][0] = "1";
        array1[0][1] = "2";
        array1[1][0] = "3";
        array1[1][1] = "4";

        // Массив весь из себя правильный
        String[][] array2 = new String[4][4];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = "1" + (j + 1);
            }
        }

        // Массив с символом вместо цифры
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "b", "4"},
                {"1", "2", "3", "4"}
        };


        try {
            getArrayFour(array1); // Здесь предлагается вручную поменять номер массива
        } catch (MyArraySizeException e) {
            e.printStackTrace();
       }
        catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static void getArrayFour(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (4 != array.length) throw new MyArraySizeException("Неверное количество строк");
        else {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        Integer integer = Integer.valueOf(array[i][j]);
                        count+=integer;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
            System.out.print("Сумма лементов массива: "+ count);
        }
    }

}




