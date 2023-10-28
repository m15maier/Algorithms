package Stack;

import java.sql.SQLOutput;

public class SpecialStack {

    private Integer[] elements = new Integer[10];
    private int size = 0;

    // Проверка стека на пустоту. @return true, если стек пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // добавление элемента в стек
    public void push(Integer elements) {
        if (size == 10) {
            System.out.println("Стек полон! Добавлять некуда!");
            return;
        }

        elements[size++] = element;
    }

    // извлечение элемента из стека
    public String pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст, извлекать нечего ");
            return null;
        }
        String element = elements[--size];
        elements[size] = null;
        return element;
    }

    // элемент getMin
    public Integer getMin() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return null;
        }

        Integer min = elements[0];
        int minIndex = 0;

        for (int i = 1; i <= index; i++) {
            if (elements[i] < min) {
                min = elements[i];
                minIndex = i;
            }
        }

    }
}
