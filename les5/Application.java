package exception.les5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        test5();
    }

    public static void test0() {
        int i = 5;
        try {
            i = 10 / 1; // ArithmeticException
            String str = null;
            // System.out.println(str.length()); // NullPointerException
            test2();
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("Переменная str была null");
        } catch (Exception e) {
            System.out.println("Непредвиденное исключение: " + e.getMessage());
        }
        System.out.println(i);
    }

    public static void test1() {
        String name = null;
        System.out.println(name.length()); // NullPointerException
    }

    public static void test2() {
        Object o = new String("123");
        File file = (File) o; // ClassCastException
        System.out.println(file);
    }

    public static void test3() {
        String str = "123w";
        int number = Integer.parseInt(str); // NumberFormatException
        System.out.println(number);
    }

    public static void test4() {
        List<Object> emptyList = Collections.emptyList(); // UnsupportedOperationException
        emptyList.add(new Object());
    }

    public static void test5() {

        try (FileReader reader = new FileReader("exception/les5/test.txt");
                FileWriter writer = new FileWriter("exception/les5/test_copy.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copying completed successfully");
    }
}
