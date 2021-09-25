package ru.mirea.classes;

public class DynamicArray {
  private int size;
  private int[] array;

  /**
   * Меняет длину массива
   * @param size      новая длина массива
   */
  private void resize(int size) {
    int[] nArray = new int[size];

    System.arraycopy(this.array, 0, nArray, 0, this.array.length);
    this.array = nArray;
  }

  /**
   * Конструктор по умолчанию
   */
  public DynamicArray() {
    this.size = 1;
  }

  /**
   * Создаёт массив на определённое количество элементов
   * @param size        количество элементов в массиве
   */
  public DynamicArray(int size) {
    this.array = new int[size];
  }

  /**
   * Добавляет элемент в конец массива
   * @param element           добавляемый элемент
   */
  public void add(int element) {
    if ((++this.size) >= this.array.length) {
      this.resize(this.array.length * 2);
      System.out.println("Изменение длины массива: " + this.array.length);
    }
    this.array[this.size - 1] = element;
  }

  /**
   * Возвращает элемент в массиве под определённым индексом
   * @param index         индекс элемента
   * @return              элемент массива
   * @throws Exception    неверный индекс для массива
   */
  public int get(int index) throws Exception {
    if (index >= array.length) {
      throw new Exception("[ERROR]: Индекса " + index + " нет в массиве длины " + array.length);
    }
    return this.array[index];
  }

  /**
   * Определяет значение для элемента на заданной позиции
   * @param index             позиция элемента
   * @param element           значение элемента
   * @throws Exception        неверный индекс массива
   */
  public void set(int index, int element) throws Exception {
    if (index >= array.length) {
      throw new Exception("[ERROR]: Индекса " + index + " нет в массиве длины " + array.length);
    }
    this.array[index] = element;
  }

  /**
   * Возвращает размер массива
   * @return        количество элементов в массиве
   */
  public int size() {
    return this.size;
  }
}
