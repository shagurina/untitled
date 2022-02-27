package HomeWork3.Task1;

public class ChangeClass <T>{

    T inter;

    public T[] changeElements(T[] array, int indexA, int indexB) {
        inter = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = inter;
        return array;
    }
}
