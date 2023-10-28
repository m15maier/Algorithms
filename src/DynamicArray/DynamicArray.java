package DynamicArray;

// Создайте структуру DynamicArray.DynamicArray
// Реализуйте два пути создания:
// DynamicArray.DynamicArray() - по умолчанию capacity = 1
// DynamicArray.DynamicArray(capacity) - изначальный массив имеет capacity = capacity
//
//        Реализуйте методы:
//        add(data) - добавляет в конец
//        remove() - удаляет последний
//        removeAt(index) - удаляет по индексу
//        growSize() - увеличивает размер
//        set(index, data) - изменяет элемент
//        clean() - удаляет все элементы
//        contains(data) - проверяет существует ли элемент
//        isEmpty() - вернет false, если в структуре есть элемент

import java.util.Arrays;

public class DynamicArray {

    // конструктор с заданным значением capacity
    private String[] array;
    private int defaultSize = 10;
    private int size;


    public DynamicArray() {
        array = new String[defaultSize];
    }

    public DynamicArray(int capacity) {
        array = new String[capacity];
    }


// добавляет в конец
    public void add(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Некорректный индекс");
            return;
        }

        if (size == array.length) {
            growSize();
        }
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;

    }


// удаляет последний
        public void remove() {
            array[--size] = null;
        }


// удаляет по индексу
        public void removeAt(int index) {
            if (index < 0 || index > size) {
                System.out.println("некорректный индекс");
                return;
            }

            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }


// увеличивает размер
        private void growSize() {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
                array = newArray;
        }

// изменяет элемент
        public void set(int index, Integer data) {
            if (index < 0 || index >= size) {
                System.out.println("Некорректный индекс");
                return;
            }
                array[index] = data;
        }


// удаляет элементы
        public void clean() {
        if (int i = 0; i < size; i ++) {
            array[i] = null;
            }
        size = 0;
        }


// проверяет существует ли элемент
        public boolean contains(Integer data) {

        }


// вернет false, если в структуре есть элемент
        public boolean isEmpty() {
            return size == 0;
        }


// для удобного вывода массива в консоль
        @Override
            public String toString() {
        // если пустой
             if (isEmpty()) {
            return "[]";
        }


// если не пустой
    StringBuilder builder = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
        builder.append(array[i]).append(", ");
    }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();

    }
}