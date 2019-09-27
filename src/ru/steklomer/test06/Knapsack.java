package ru.steklomer.test06;

import java.util.*;

public class Knapsack {
  
  Item[] items;
  int capacity;
  
  public Knapsack(Item[] a, int b) {
    items = a; 
    capacity = b;
  }

  public static void main(String[] args) {
    // test data
    int cap = 23;
    Item[] items = {new Item(14, 12), 
                    new Item(9, 1), 
                    new Item(7, 2), 
                    new Item(1, 1),
                    new Item(10, 4)};
    //
    int itemCount = items.length;
    int[][] Arr = new int[itemCount + 1][cap + 1];
    
    for (int i = 0; i <= cap; i++) {
      Arr[0][i] = 0;
    }
    for (int i = 1; i <= itemCount; i++) {
      for (int j = 0; j <= cap; j++) {
        if (items[i - 1].weight > j)
          Arr[i][j] = Arr[i-1][j];
        else
          Arr[i][j] = Math.max(Arr[i-1][j], Arr[i-1][j - items[i-1].weight] + items[i-1].value);
      }
    }
    
    int goodsWeight = cap;
    int goodsValue = Arr[itemCount][cap];
    List<Item> totalGoods = new ArrayList<>();

    for (int i = itemCount; i > 0 && goodsValue > 0; i--) {
      if (goodsValue != Arr[i-1][goodsWeight]) {
        totalGoods.add(items[i-1]);
        goodsWeight -= items[i-1].weight;
        goodsValue -= items[i-1].value;
      }
    }
    
    int totalWeight = 0;
    int totalValue = 0;
    Knapsack knapsack = new Knapsack(items, cap);
    System.out.println("Набор вещей в количестве: " + items.length);
    for (Item i : items) {
      System.out.println("вес - " + i.weight + ", стоимость - " + i.value);
    }
    System.out.println("Рюкзак грузоподъёмностью " + cap + " вмещает вещи:");
    for (Item i : totalGoods) {
      System.out.println("вес - " + i.weight + ", стоимость - " + i.value);
      totalWeight += i.weight;
      totalValue += i.value;
    }
    
    System.out.println("Суммарный вес - " + totalWeight + ", суммарная стоимость - " + totalValue);
  }
}
