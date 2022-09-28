package lab2;
/*
Дан двумерный числовой массив. Значения элементов главной диагонали возвести в
квадрат.
*/
public class Task3 {
    public static void main(String[] args) {
        final int n = 5;
        int[][] array = new int[n][n];
        System.out.println("Массив до изменения:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random()*100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            array[i][i] *= array[i][i];
        }
        System.out.println("Массив после изменения:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
