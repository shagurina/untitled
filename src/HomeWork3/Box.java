package HomeWork3;

import java.util.ArrayList;

public class Box <T extends  Fruit>{

    T[] fruitArray;
    ArrayList<T> fruitList;

    public Box(T[] fruitArray, ArrayList<T> fruitList) {
        this.fruitArray = fruitArray;
        this.fruitList = fruitList;
    }

    public Float getBoxArray() {
        float result = 0;
        for (T t: getFruitArray()) {
            if (t != null) {
                Float value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Float getBoxList() {
        float count = 0;
        for (T t: getFruitList()) {
            Float value = t.getWeight();
            count = count + value;
        }
        return count;
    }

    public T[] getFruitArray() {
        return fruitArray;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public Boolean compare(Box<? extends Fruit> box){
        if(this.getBoxArray().intValue() == box.getBoxArray().intValue()) return true;
        return false;
    }

    public Boolean compareList(Box<T> box){
        if(this.getBoxList().intValue() == box.getBoxList().intValue()) return true;
        return false;
    }

    public void toEmptyArray(Box<T> box) {
        System.out.println("В коробке до: " + this.getBoxArray());
        System.out.println("В промежуточной коробке: " + box.getBoxArray());
        for (int i = 0; i < box.getFruitArray().length; i++) {
            if (box.getFruitArray()[i] != null) {
                this.getFruitArray()[getSize()] = box.getFruitArray()[i];
                box.getFruitArray()[i] = null;
            }
        }
        System.out.println("В коробке после: " + this.getBoxArray());
        System.out.println("В промежуточной коробке после: " + box.getBoxArray());
    }

    private int getSize(){
        int count = 0;
        for(T t: getFruitArray()){
            if(t!=null)count++;
        }
        return count;
    }

//    public void toEmptyList(Box<T> box){
//        System.out.println("В коробке до: " + this.getBoxArray());
//        System.out.println("В промежуточной коробке до: " + box.getBoxArray());
//        for(T t: box.getFruitList()){
//            this.getFruitList().add(t);
//        }
//        box.getFruitList().clear();
//        System.out.println("В коробке после: " + this.getBoxList());
//        System.out.println("В промежуточной коробке после: " + box.getBoxArray());
//    }

}
