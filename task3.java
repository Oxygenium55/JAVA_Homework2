// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
// (возвращает boolean значение).

package homework2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(isPalindrom(string));
        in.close();
    }

    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
}
