/*1. Реализуйте 4 метода, чтобы в каждом из них получить разные исключения
 */
package exceptions.les2;

public class Homework1 {
    public static void main(String[] args) {
        arithmeticException(10, 0);
        arrayIndexOutOfBoundsException(3);
        numberFormatException("exception");
    }

    // 1. Метод, который вызывает исключение ArithmeticException
    public static void arithmeticException(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }
    
    // 2. Метод, который вызывает исключение ArrayIndexOutOfBoundsException
    public static void arrayIndexOutOfBoundsException(int a) {
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[a]);
    }

    // 3. Метод, который вызывает исключение NumberFormatException
    public static void numberFormatException(String str)  {
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
