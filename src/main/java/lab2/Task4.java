package lab2;
/*
В квадратной матрице определить максимальный и минимальные элементы. Если таких
элементов
несколько, то максимальный определяется по наибольшей сумме своих индексов,
минимальный –
по наименьшей.
*/
public class Task4 {
    public static void main(String[] args) {
        final int N = 5;
        int[][] array = new int[N][N];
        System.out.println("Заполненный массив:");
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random()*100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int minI, minJ, maxI, maxJ;
        minI = minJ = maxI = maxJ = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(array[i][j] >= array[maxI][maxJ]) {
                    if (array[i][j] == array[maxI][maxJ]) {
                        if (i + j > maxI + maxJ) {
                            maxI = i;
                            maxJ = j;
                        }
                    } else {
                        maxI = i;
                        maxJ = j;
                    }
                }
                if(array[i][j] <= array[minI][minJ]) {
                    if (array[i][j] == array[minI][minJ]) {
                        if (i + j < minI + minJ) {
                            minI = i;
                            minJ = j;
                        }
                    }else{
                        minI = i;
                        minJ = j;
                    }
                }
            }
        }
        System.out.println("Наибольший элемент: " + array[maxI][maxJ]);
        System.out.println("Наименьший элемент: " + array[minI][minJ]);
    }
}