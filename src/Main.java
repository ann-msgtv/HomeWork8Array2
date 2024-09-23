import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //task1
        System.out.println("task1");

        int [] payments = new int[5];
        int sum = 0;
        payments [0] = 123222;
        payments [1] = 159029;
        payments [2] = 98938;
        payments [3] = 89383;
        payments [4] = 139458;
        for (final int i :payments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //task2
        System.out.println("task2");

        int [] expense = {439034, 203943, 309483, 948543, 56758};
        int minExpense = expense[1];
        int maxExpense= expense[1];
        for (int i = 0; i < expense.length ; i++) {
            if (maxExpense < expense[i]) {
                maxExpense = expense[i];
            }
            if (minExpense>expense[i]) {
                minExpense = expense[i];
            }

        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " +maxExpense+ " рублей");


        //task3
        System.out.println("task3");

        int [] costs = new int[5];
        int summ = 0;
        costs [0] = 123229;
        costs [1] = 159029;
        costs [2] = 98938;
        costs [3] = 89383;
        costs [4] = 139458;
        for (final int i :costs) {
            summ += i;
        }
        double average = (double) summ / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");



        //task4
        System.out.println("task4");

//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i = 0; i <= reverseFullName.length/2 ; i++) {
//            int first = i;
//            int last = reverseFullName.length - 1 - i;
//
//            char stock = reverseFullName[first];
//            reverseFullName[first] = reverseFullName[last];
//            reverseFullName[last] = stock;
//        }
//
//        System.out.println(reverseFullName);

        char[] reverseFullName1 = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName1.length - 1 ; i >=0 ; i--) {
            System.out.print(reverseFullName1[i]);
        }
        System.out.println();



    }







}