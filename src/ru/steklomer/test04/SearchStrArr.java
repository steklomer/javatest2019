package ru.steklomer.test04;

import java.util.*;

public class SearchStrArr {

  public static void main(String args[]) {
    System.out.println("Введите предложение:");
    Scanner in1 = new Scanner(System.in);
    String str = in1.nextLine();
    System.out.println("Введите слово для поиска:");
    Scanner in2 = new Scanner(System.in);
    String word = in2.nextLine();
    String[] sArr = str.split("\\s+");
    int res = 0;
    System.out.println("Результат: ");
    for (int i = 0; i < sArr.length; i++) {
      if (sArr[i].compareToIgnoreCase(word) == 0) {
        res = res + 1;
        //System.out.println(sArr[i]);
      }
    }
    System.out.println("Количество совпадений - " + res);
  }
}
