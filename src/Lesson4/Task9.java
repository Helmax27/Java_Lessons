package Lesson4;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Элементы расположены не по возрастанию");
                break;
            } else if (i != array.length - 2) {
                continue;
            }
            System.out.println("Элементы расположены по возрастанию");
        }
    }
}
