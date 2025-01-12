/*2. Посмотрите на код и подумайте сколько разных типов исключений вы тут
сможете получить?
 */
package exceptions.les2;

public class Homework2 {
public static void main(String[] args) {
    String[][] arr = {{"1","2","3"}, {"1","2","3"}, {"1","2","3"}};
    System.out.println(sum2d(arr));

}
public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 3; j++) {
            sum += Integer.parseInt(arr[i][j]);
        }
    }
    return sum;
}
}
