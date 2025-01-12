package exceptions.les1;

import java.io.File;

public class les1 {

    public static void main(String[] args) {
        System.out.println(divide(10, 0)); // ArithmeticException
        // System.out.println(getFileSize(new File("exceptions\\Application.java")));
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divide by zero not permited");
        }
        return a / b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }

}
