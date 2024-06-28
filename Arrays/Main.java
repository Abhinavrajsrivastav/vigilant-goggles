import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(array));

        int firstElement = array[0];
        int lastElement = array[array.length - 1];

        array[2] = 35;
        Arrays.toString(array);

        int length = array.length;

        System.out.print("Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int element : array) {
            System.out.print(element + " ");
        }

        int[] copiedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(array);

        int index = Arrays.binarySearch(array, 35);

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);

        boolean arraysEqual = Arrays.equals(array, copiedArray);
    }
}
