package ru.steklomer.test02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GcdForInt {
  
  public static void main(String args[]) {
    System.out.println("Введите 2 целых числа:");
    Scanner in1 = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    String res = "Результат: ";
    try {
      int i1 = in1.nextInt();
      int i2 = in2.nextInt();
      res = res + "для целых чисел " + i1 + " и " + i2 + " НОД = " + getGCD(i1, i2) + " и НОК = " + getLCM(i1, i2);
    } catch (InputMismatchException e) {
      res = "Ошибка: введённое значение не является целым числом";
    }
    System.out.println(res);
  }
  
  public static int getGCD(int m, int n) {
    if (n == 0) {
      return m;
    } 
    return getGCD(n,m % n);
  }
  
  public static int getLCM(int m, int n) {
    return Math.abs(m * n) / getGCD(m, n);
  }
}
