/*Задание №8 (доп)
Реализуйте метод, принимающий в качестве аргументов двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.
Как бы вы реализовали подобный метод?
 */
package exceptions.les2;

public class Task8 {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2 }, { 4, 5, 6 }, { 7, 8, 9 } };
        if(checkRowsAndColumns(arr)){
            System.out.println("Количество строк и столбцов совпадают");
        }else{
            System.out.println("Количество строк и столбцов не совпадают");
        }
    }

    public static boolean checkRowsAndColumns(int[][] arr) {
        int rows = arr.length;
        
        for (int i = 0; i < rows; i++) {
            if (arr[i].length != rows) {
                return false;
            }
        }
        return true;
    }
}
