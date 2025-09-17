//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr = new int[5];
        arr[1] = 14000;
        arr[2] = 17629;
        arr[3] = 89283;
        arr[4] = 12342;
        arr[0] = 2993;
        int sum = 0;
        for (final int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        //task 2
        int mx=-1;
        int mn=325555555;
        for (final int element : arr) {
            if (element <mn) {
                mn=element;
            }
            if (element>mx)
                mx=element;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + mn + " рублей. Максимальная сумма трат за неделю составила " + mx + " рублей.");
        Arrays.sort(arr);
        System.out.println();
        //task 3
        double mean = 0;
        mean = sum * 1.0 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей.");
        System.out.println();
        //task 4
        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char promej;
        int j = reserveFullName.length - 1;
        for (int i = 0; i <= reserveFullName.length/2 && j>=0; i++, j--)
        {
            promej = reserveFullName[i];
            reserveFullName[i] = reserveFullName[j];
            reserveFullName[j] = promej;
        }
        System.out.println(reserveFullName);
    }

}
