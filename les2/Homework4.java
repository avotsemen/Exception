/*Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающий новый массив, каждый элемент которого равен
частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое
пользователь может увидеть - RuntimeException, т.е. ваше
 */
package exceptions.les2;

import java.util.Arrays;

public class Homework4 {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 0};
        try {
            int[] result = divArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] divArrays(int[] arr1, int[] arr2) throws RuntimeException{

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разную длину");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя");
            }else{
            result[i] = arr1[i] / arr2[i];
            }
        }
        return result;
    }
}

