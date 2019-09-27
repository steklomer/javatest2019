package ru.steklomer.test05;

import java.util.*;

public class PalindromeNum {
  
  public static void main(String args[]) {
    System.out.println("Введите целое число от 1 до 100:");
    Scanner in = new Scanner(System.in);
    try {
      int p = in.nextInt();
      if (p < 1 || p > 100) {
        throw new Exception();
      }
      System.out.println("Числа-палиндромы в диапазоне от 0 до " + p + ":");
      for (int i = 0; i <= p; i++) {
        if (isPalindrome(Integer.toString(i))) {          
          System.out.println(i);
        }
      }
    } catch (InputMismatchException e) {
      System.err.println("Ошибка: введённое значение не является целым числом");
    } catch (Exception e) {
      System.err.println("Ошибка: введённое значение не попадает в диапазон от 1 до 100");
    }
    
  }

  public static boolean isPalindrome(String str) {
    int len = str.length();
    char[] cArr = new char[len];
    char[] revArr = new char[len];
    for (int i = 0; i < len; i++) {
      cArr[i] = str.charAt(i);
      revArr[i] = str.charAt(len - 1 - i);
    }
    return Arrays.equals(cArr, revArr);    
  }
}
