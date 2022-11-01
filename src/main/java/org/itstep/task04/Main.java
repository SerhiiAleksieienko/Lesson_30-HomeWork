package org.itstep.task04;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws BinarySearchCastException {
        // TODO: проверяйте ваш код здесь
        int[] arr1 = {5, 6, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
         int a,b;
         try {
             a=Main.binarySearchCast(arr1,6);
             System.out.println("a = " + a);
         } catch (BinarySearchCastException e){
             System.err.println(e);
         }
        try {
            b=Main.binarySearchCast(arr2,4);
            System.out.println("b = " + b);
        } catch (BinarySearchCastException e2){
            System.err.println(e2);
        }



    }


    /**
     * @param arr   - массив элементов типа int
     * @param value - значение, искомое в массиве
     * @return - возвращает индекс искомого элемента в массиве
     */
    public static int binarySearchCast(int[] arr, int value) throws BinarySearchCastException { //метод проверяет отсортирован ли массив и если да, в
        int index = -1; //индекс искомого элемента
        boolean sorted = true;// отсортирован ли массив
        for (int i = 0; i < arr.length - 1; i++) { //проверка сортированности
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) { //если массив отсортирован, то можно искать бинарным поиском
            index = Arrays.binarySearch(arr, value);
        } else {
            throw new BinarySearchCastException();
        }
        return index;
    }

}

class BinarySearchCastException extends Exception {
    public BinarySearchCastException() {
    }

    @Override
    public String toString() {
        return "Массив не отсортирован";
    }
}
