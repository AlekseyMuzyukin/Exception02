import java.util.Scanner;

public class Example01 {

    private static final Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        float res = returnFloat();
        System.out.println("Введенное число: " + res);
    }

    public static float returnFloat() {
        float res = 0.0f;
        while (true) {
            System.out.print("Введите число c плавающей запятой: ");
            String str1 = iScanner.nextLine();
            try {
                if (str1 != "") {
                    return Float.parseFloat(str1);
                } else {
                    System.out.println("Строка не может быть пустой");
                }
            } catch (RuntimeException e) {
                System.out.println("Введите числовое значение");
            }
        }
    }
}