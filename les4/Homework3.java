package exception.les4;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b); // Потенциальное деление на ноль
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[1] = 9; // Потенциальная ошибка выхода за границы массива
            System.out.println(Arrays.toString(abc));
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: Деление на ноль!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Ошибка: Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Ошибка: Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b); // Суммируем два числа
    }
    
}
