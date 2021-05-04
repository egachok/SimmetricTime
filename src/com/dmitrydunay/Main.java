//1) Электронные часы показывают время в формате от 00:00 до 23:59.
// Подсчитать сколько раз за сутки случается так, что слева от двоеточия
// показывается симметричная комбинация для той, что справа от двоеточия
// (например, 02:20, 11:11 или 15:51).
package com.dmitrydunay;

public class Main {

    public static void main(String[] args) {

        int match = 0;

        for (int h = 0; h < 24; h++) {
            for (int min = 0; min < 60; min++) {
                if ((((h / 10) % 10) == (min % 10)) & ((h % 10) == ((min / 10) % 10))){
                    match++;
                }
            }
        }
        System.out.println("Total matches is: " + match);
    }
}