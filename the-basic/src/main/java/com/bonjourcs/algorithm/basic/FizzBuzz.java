package com.bonjourcs.algorithm.basic;

import java.util.stream.IntStream;

/**
 * @author Liang Chenghao
 * Description: fizzbuzz problem
 * Date: 2019/4/11
 */
public class FizzBuzz {

    public static void fizzBuzz(int num) {

        IntStream.rangeClosed(1, num).forEach(
                value -> {
                    if (value % 15 == 0) {
                        System.out.println("FizzBuzz [" + value + "]");
                    } else if (value % 3 == 0) {
                        System.out.println("Fizz [" + value + "]");
                    } else if (value % 5 == 0) {
                        System.out.println("Buzz [" + value + "]");
                    } else {
                        System.out.println(value);
                    }
                }
        );

    }
}
