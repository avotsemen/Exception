/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
package exception.les4;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число (например, 3.14): ");
            try {
                result = Float.parseFloat(scanner.nextLine()); // Преобразуем ввод пользователя в float
                validInput = true; // Выход из цикла, если ввод корректный
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }

        return result;
    }
}
