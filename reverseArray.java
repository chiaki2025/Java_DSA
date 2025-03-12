import java.util.*;

public class ReverseArray {
    public static void reverse(int[] array) {
        int length = array.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }
}
