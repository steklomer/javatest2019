package ru.steklomer.test01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckInt {
  
  public static void main(String args[]) {
    System.out.println("Введите целое число:");
    Scanner in = new Scanner(System.in);
    String res = "Результат: ";
    try {
      int i = in.nextInt();
      res = res + i + " - число";
      if (isOdd(i)) {
        res = res + " нечётное";
      } else {
        res = res + " чётное";
      }
      if (i > 1) {
        if (isPrime(i)) {
          res = res + " простое";
        } else {
          res = res + " составное";
        }
      }
    } catch (InputMismatchException e) {
      res = res + " ошибка: введённое значение не является простым числом";
    }
    System.out.println(res);
  }
  
  public static boolean isOdd(int n) {  
    if (n % 2 == 0) {
      return false;
    } else {
      return true;
    }
  }

  public static boolean isPrime(int n) {  
    if (n == 1) 
      return false;
    for (int j=2; j < n; j++) {
      if (n % j == 0)
        return false;
    }
    return true;    
  }
}
