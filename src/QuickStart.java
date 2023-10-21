// Изучить присланный код TimSort. Изучить присланный код QuickSort
// и расписать его комментариями, указав, что каждая строчка делает.

    public class QuickSort {

    // Объявляем метор с параметраями: массив, левый, правый
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) { // Проверяем что левая часть меньше правой

                int pivotIndex = partition(array, left, right);  //  Делаем переменнаую pivot опорной
                quickSort(array, left, pivotIndex - 1); // рекурсивнй вызов
                quickSort(array, pivotIndex + 1, right); // рекурсивнй вызов метода  в правую часть
            }
        }

        // Объявляем метор с параметраями: массив, левый, правый
        public static int partition(int[] array, int left, int right) {
            int pivot = array[right]; // объявление опорного элемента
            int i = left; // объявление переменной i со значением left

            // задаём цикл для прохода по массиву от левой до правой
            for (int j = left; j < right; j++) {
                if (array[j] < pivot) { // проверка что текущий элемент меньше опорного
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++; // увеличиваем значение на 1
                }
            }

            array[right] = array[i]; // обмен значениями элемента с индексом right и элемента с индексом i
            array[i] = pivot;
            return i; // возвращение индекса опорного элемента
        }


        public static void main(String[] args) {
            int[] array = {4, 2, 7, 1, 9, 3}; // создали массив
            quickSort(array, 0, array.length - 1); //вызов метода для массива
            for (int num : array) {
                System.out.print(num + " "); // вывод сортированного массива на экран
            }
        }
    }



