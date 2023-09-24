package org.example;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class JavaBazhenov {
    public static void checkNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextInt() ) {
            int number = sc.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        }
    }
    public static void checkName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        if (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (Objects.equals(name, "Вячеслав")) {
                System.out.println("Привет, " + name);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
    public static void checkArr() {
        System.out.println("Введите числовой массив:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] intArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.print("Числа кратные 3: ");
        for (int i : intArr) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        checkNum();
        checkName();
        checkArr();
    }
}
