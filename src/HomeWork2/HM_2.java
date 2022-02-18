package HomeWork2;

public class HM_2 {

    public static void main(String[] args) {

        String[][] array1 = new String[2][2];
        array1[0][0] = "1";
        array1[0][1] = "2";
        array1[1][0] = "3";
        array1[1][1] = "4";

        String[][] array2 = new String[4][4];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = "1" + (j + 1);
            }
        }


     //   arrayStringWrongSize(array2);
      //  getArrayFour(array2);
    //    arrayStringInsert();
    //    getArrayFour(array2);
        try {
            getArrayFour(array2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void getArrayFour(String[][] array) throws MyArraySizeException {
        if (4 != array.length) throw new MyArraySizeException("Неверное количество строк");

    }


   public static void arrayStringWrongSize(String[][] array2) {

       for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++){
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
       }

   }

//    public static void arrayStringInsert() {
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//
//        }

    }




