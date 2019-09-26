package ru.steklomer.test03;

import java.util.*;

public class StrArr {

  public static void main(String args[]) {
    System.out.println("Введите предложение:");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String[] sArr = str.split("\\s+");
    Arrays.sort(sArr);
    System.out.println("Результат: ");
    for (int i = 0; i < sArr.length; i++) {
      System.out.println(sArr[i].substring(0, 1).toUpperCase() + sArr[i].substring(1));
    }
    System.out.println("Количество слов - " + sArr.length);
  }
}
