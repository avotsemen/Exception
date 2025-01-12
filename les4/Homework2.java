package exception.les4;

public class Homework2 {
    public static void main(String[] args) {
        try {
            int d = 1;
            int[] intArray = new int[5]; // Инициализируем массив
            double catchedRes1 = intArray[8] / d; // Попытка деления на ноль
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

    }
}