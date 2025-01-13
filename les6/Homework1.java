package exception.les6;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");

        String input = scanner.nextLine();
        try {
            processInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: ");
            e.printStackTrace();
        }
    }

    private static void processInput(String input) throws IOException {
        // Разделение строки на части
        String[] parts = input.split(" ");
        if (parts.length != 6) {
            throw new IllegalArgumentException(
                "Неверное количество данных. Ожидалось 6 элементов: Фамилия Имя Отчество датарождения номертелефона пол.");
        }

        // Парсинг данных
        String lastName = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        LocalDate birthDate = parseBirthDate(parts[3]);
        long phoneNumber = parsePhoneNumber(parts[4]);
        char gender = parseGender(parts[5]);

        // Формирование строки для записи
        String data = String.format("%s %s %s %s %d %c", lastName, firstName, middleName,
                birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), phoneNumber, gender);

        // Запись данных в файл
        writeToFile(lastName, data);
        System.out.println("Данные успешно сохранены.");
    }

    private static LocalDate parseBirthDate(String dateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Некорректный формат даты рождения. Ожидалось: dd.MM.yyyy");
        }
    }

    private static long parsePhoneNumber(String phoneStr) {
        try {
            return Long.parseLong(phoneStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректный номер телефона. Ожидалось целое число без форматирования.");
        }
    }

    private static char parseGender(String genderStr) {
        if (genderStr.length() != 1 || !(genderStr.equalsIgnoreCase("f") || genderStr.equalsIgnoreCase("m"))) {
            throw new IllegalArgumentException("Некорректное значение пола. Ожидалось 'f' или 'm'.");
        }
        return genderStr.toLowerCase().charAt(0);
    }

    private static void writeToFile(String lastName, String data) throws IOException {
        File file = new File("exception/les6/" + lastName + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine();
        }
    }
}
