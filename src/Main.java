
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /** 31
     Даны вещественное число а и натуральное число n. Вычислить:
     S=1/a + 1/a^2 + 1/a^4+...+1/a^(2n-2). */

    private static void task1() {
        Scanner Scanner = new Scanner(System.in);
        float real_number,sum=0;
        int natural_number;
        System.out.print("Enter real a: ");
        real_number = Scanner.nextInt();
        System.out.print("Enter natural n: ");
        natural_number = Scanner.nextInt();
        if(natural_number>0)
        {
            for (int i = 1; i <= natural_number; i++)
                sum += 1 / Math.pow(real_number, (2 * natural_number - 2));
            System.out.print("Sum= " + sum);
        }
        else
            System.out.print("Enter natural n.");
    }

    /**
     * 56
     * Вычислить сумму: 1 + 1/3 + 1/3^2 + ... + 1/3^8.
     */
    private static void task2() {
        double sum=0;
        for(int degree=0;degree<=8;degree++)
            sum=sum+1/Math.pow(3,degree);
        System.out.println("Sum= "+sum);
    }

    /**
     * 81
     * Даны числа а1, a2, …, а10. Определить их сумму.
     */
    private static void task3()
    {
        int Array[] = {3,2,5,6,4,5,3,2,1,5};
        int sum=0;
        for(int number=0;number<=9;number++)
            sum+=Array[number];
        System.out.println("Sum = "+ sum);
    }

    /**
     * 106
     * Дана непустая последовательность натуральных чисел, за которой следует 0. Составить программу поиска
     * в данной непустой последовательности порядкового номера наибольшего элемента.
     */
    private static void task4() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int lenght = Scanner.nextInt();
        int[] Array = new int[lenght];
        int max=-1;
        Array[lenght-1]=0;
        for(int number=0;number<lenght-2;number++) {
            Array[number] = (int) (Math.random()*(200+1)) - 100;
            if (Array[number]>max)
                max=Array[number];
        }
        System.out.println("Max number: " + max);
    }

    /**
     * 131
     * Проверить, существует ли четырёхзначное целое число, равное четвертой степени суммы своих цифр.
     */
    private static void task5() {
        int sum;
        for(int number=1000;number<10000;number++)
        {
            sum=number/1000+(number/100)%10+(number/10)%10+number%10;
            if(Math.pow(sum,4)==number)
                System.out.println("This number: " + number);
        }

    }

}