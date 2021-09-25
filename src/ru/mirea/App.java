package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.DynamicArray;

public class App {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print("Введите количество элементов массива: ");
    int size = IN.nextInt();

    DynamicArray array = new DynamicArray(size);

    System.out.print("Введите элементы массива: ");
    for (int i = 0; i < size; ++i) {
      array.add(IN.nextInt());
    }

    System.out.println();
    System.out.print("Массив: ");

    System.out.print(array.get(0));
    for (int i = 1; i < size; ++i) {
      System.out.print(" " + array.get(i));
    }
    System.out.println();

    System.out.println("Размер массива: " + array.size());

    int value = 55;
    array.add(value);
    array.add(value);

    System.out.println();
    System.out.print("Массив: ");

    System.out.print(array.get(0));
    for (int i = 1; i < array.size(); ++i) {
      System.out.print(" " + array.get(i));
    }
    System.out.println();

    System.out.println("Размер массива: " + array.size());

    array.set(0, 645);

    System.out.println();
    System.out.print("Массив: ");

    System.out.print(array.get(0));
    for (int i = 1; i < array.size(); ++i) {
      System.out.print(" " + array.get(i));
    }
    System.out.println();

    System.out.println("Размер массива: " + array.size());
  }
}
