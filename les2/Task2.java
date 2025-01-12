/*Задание №2
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке. */
package exceptions.les2;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1}, {1,1,1}, {0,0,0}};
        int sum = sumElement(matrix);
        System.out.println(sum);
    }

    public static int sumElement(int[][] matrix){
        int n = matrix.length;
        for(int[] row:matrix){
            if(row.length!=n){
                throw new RuntimeException("Неквадратная матрица!");
            }
            for(int num:row){
                if(num!=0 && num!=1){
                    throw new RuntimeException("В матрице должны быть только 0 или 1!");
                }
            }
        }
        int sum = 0;
        for(int[] row:matrix){
            for(int num:row){
                sum+=num;
            }
        }
        return sum;

    }

}
