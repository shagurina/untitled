package HomeWork2;

public class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        super(String.format("Invalid data in %d row, %d column", row, col));
    }
// эту часть пришлось взять из интернетов, знаний не хватило на вывод номеров строки и столбца  с ошибкой
}
