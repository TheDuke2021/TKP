package lab2;
/*
Сформировать одномерный массив из целых чисел. Вывести на экран индексы тех
элементов,
которые кратны трем и пяти.
*/
public class Task2 {
    public static void main(String[] args) {
        final int N = 10;
        int array[] = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("Изначальный массив: ");
        for(int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Индексы элементов, кратные трём и пяти");
        for(int i = 0; i < N; i++) {
            if(array[i] % 3 == 0 || array[i] % 5 == 0)
                System.out.print(i + " ");
        }
    }
}
