package exception.les4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                throw new IllegalArgumentException("Пустые строки вводить нельзя!");
            }

            System.out.println("Вы ввели: " + input);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
