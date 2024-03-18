import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);

        }
        System.out.println("------------");
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);

        }
        System.out.println("------------");
        List<String> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);
        System.out.println(" Объединение в  лист С: " + listC);
        System.out.println("-----------");

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список по длинне слова по нарастанию: " + listC);
    }

    }
}