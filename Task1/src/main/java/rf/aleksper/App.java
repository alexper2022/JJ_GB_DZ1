package rf.aleksper;

import java.util.stream.IntStream;

/*
  1. Напишите программу, которая использует Stream API для обработки списка чисел.
     Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class App {
    public static void main(String[] args) {

        int[] array = new int[]{5, 33, 7, 534, 3, 1, 55, 323, 23, 44, 9, 67, 8, 98, 54, 90};

        // Без Stream API
        double summ1 = 0;
        int count = 0;
        for (int n : array) {
            if (n % 2 == 0) {
                summ1 += n;
                count++;
            }
        }
        System.out.println(summ1 / count);

        // Со Stream API
        double summ2 = IntStream.of(array).filter(n -> n % 2 == 0).average().getAsDouble();
        System.out.println(summ2);
    }
}
