import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] expenses = new int[30];  //пустой массив трат за месяц
        double sum = 0;

        Random random = new Random(); // случайное число
         System.out.println("Задача 2");
        for (int i=0;i <expenses.length; i++) {
            expenses[i] = random.nextInt(10000)+10000;
            sum+=expenses[i];
            System.out.println(expenses[i]);
        }
        int maxWastes=0;
        int minWastes=expenses[0]+1;
        for (final int expensTest : expenses) {
            if (minWastes > expensTest) {
                minWastes = expensTest;
            }
            if (expensTest > maxWastes) {
                maxWastes = expensTest;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minWastes+ " рублей. Максималь" +
                "ная сумма трат за день составила "+maxWastes+" рублей");

        System.out.println("Задача 1");
        System.out.println("Сумма трат за месяц составила " + sum+" рублей.");
        // Задача 3
        System.out.println("Задача 3");
        double averageAmountSpent = sum/30;
        System.out.println("Средняя сумма трат за месяц составила "+averageAmountSpent+" рублей.");
        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}