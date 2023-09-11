import java.util.Random;
import java.util.Scanner;

public class Array_Handling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Array Method

        System.out.print("Please type the length of the array: ");
        int length = in.nextInt();
        int[] arrayOfUser = inputArray(length);

        // Print Array Method

        System.out.println("User's Array:");
        printArray(arrayOfUser);

        // Sum of your array elements

        int sum = sumArray(arrayOfUser);
        System.out.println("Sum of your array elements: " + sum);

        // Largest value in the array

        System.out.print("Please type the length of your new array: ");
        int newLength = in.nextInt();
        int[] randomArray = createRandomArray(newLength);
        int largestValue = findLargestValue(randomArray);
        System.out.println("The largest value in the array: " + largestValue);

        // Search value in array method

        System.out.print("Enter a value to search in the array: ");
        int searchValue = in.nextInt();
        int index = searchValueInArray(arrayOfUser, searchValue);
        if (index != -1) {
            System.out.println("Value found has the index: " + index);
        } else {
            System.out.println("Value not found in your array.");
        }

        in.close();
    }

    // Input Array Method

    public static int[] inputArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element at index " + (i+1) + ": ");
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    // Create an array with random values method

    public static int[] createRandomArray(int length) {
        int[] newArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Change 100 to the desired range
        }

        return newArray;
    }

    // Print Array Method

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Sum of array elements

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Largest value in an array

    public static int findLargestValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Search value in array method

    public static int searchValueInArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}