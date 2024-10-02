package logicPrograms;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Call the function to reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    // Function to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from the start and end of the array
        while (start < end) {
            // Swap
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move to the next elements
            start++;
            end--;
        }
    }
}

