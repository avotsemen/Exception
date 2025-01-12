/*3. Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить
пользователя.
*/

package exceptions.les2;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1};
        try {
            int[] result = diffArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы имеют разную длину");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
