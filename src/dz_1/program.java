package dz_1;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class program {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(2, 3, 6, 76, -8, -2, 0, 31, 4, 4, 8, 83, 54);
        // сумма 144 / 10 чисел

        OptionalDouble average = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Среднее значение всех четных чисел в списке: " + average.getAsDouble());
        } else {
            System.out.println("В списке нет четных чисел.");
        }

    }
}