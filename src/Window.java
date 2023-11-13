import java.util.List;

// Расписать подробно каждую строчку этого кода комментариями или самостоятельно реализовать решение задачи:
// Дан массив положительных целых чисел и целевое число target.
// Необходимо найти самую короткую подпоследовательность чисел в массиве, сумма которых равна target.
// Верните эту самую короткую подпоследовательность.
public class Window {

    // Код находит самую короткую подпоследовательность чисел в массиве, сумма которых равна целевому числу target.

    // Устанавливаем левую и правую границы окна (подпоследовательности) на начало массива.
    public static void findShortestArray(List<Integer> arrayList, int targetSum){
        int leftBorder = 0;
        int rightBorder = 0;
        int sum = 0;

// Инициализируем переменную для хранения текущей суммы подпоследовательности и
// переменную для хранения минимальной длины найденной подпоследовательности.
        int minLength = Integer.MAX_VALUE;
        int answerLeftBorder = 0;
        int answerRightBorder = 0;

// Проходим по массиву с помощью цикла while, увеличивая правую границу окна и добавляя элементы к текущей сумме,
// пока не достигнем целевой суммы или правая граница окна не достигнет конца массива.
        while(rightBorder < arrayList.size()){
            sum += arrayList.get(rightBorder);

// Если текущая сумма превышает целевую, уменьшаем размер окна, увеличивая левую границу и уменьшая текущую сумму.
            while(sum >= targetSum){
                int windowLength = rightBorder - leftBorder + 1;

// Если длина текущего окна меньше минимальной найденной длины и текущая сумма равна целевой,
// обновляем минимальную длину и сохраняем индексы левой и правой границ окна.
                if(windowLength < minLength && sum == targetSum) {
                    answerLeftBorder = leftBorder;
                    answerRightBorder = rightBorder;
                    minLength = windowLength;
                }
                sum -= arrayList.get(leftBorder);
                leftBorder++;
            }
            rightBorder++;
        }
// По завершении цикла проверяем, была ли найдена подпоследовательность суммирующаяся в целевое число.
// Если да, возвращаем эту подпоследовательность, если нет - возвращаем [-1].
        if(minLength != Integer.MAX_VALUE){
            for(int i = answerLeftBorder; i <= answerRightBorder; i++) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 1, 1, 2, 4, 5);

        findShortestArray(arrayList, 3);
    }

}
