/**
 * Задача 1:
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */

import java.util.*;

public class Htask41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, равное колличеству элементов Вашего списка, и нажмите enter: ");
        int n = scanner.nextInt();

        System.out.println("Введите число и нажмите enter: ");
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addLast(scanner.nextInt());
        }
        scanner.close();

        Deque<Integer> reversedlist = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            reversedlist.addFirst(list.pop());
        }

        System.out.println(reversedlist);

    }
}
