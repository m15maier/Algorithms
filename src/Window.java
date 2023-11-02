import java.util.List;

// Расписать подробно каждую строчку этого кода комментариями или самостоятельно реализовать решение задачи:
// Дан массив положительных целых чисел и целевое число target. Необходимо найти самую короткую подпоследовательность чисел в массиве, сумма которых равна target. Верните эту самую короткую подпоследовательность.
public class Window {

    // Код находит самую короткую подпоследовательность чисел в массиве, сумма которых равна целевому числу target.

    //
    public static void findShortestArray(List<Integer> arrayList, int targetSum){
        int leftBorder = 0;
        int rightBorder = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;
        int answerLeftBorder = 0;
        int answerRightBorder = 0;

        while(rightBorder < arrayList.size()){
            sum += arrayList.get(rightBorder);
            while(sum >= targetSum){
                int windowLength = rightBorder - leftBorder + 1;
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
