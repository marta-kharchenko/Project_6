import java.util.Scanner;
/**
* Demonstrate array creation
 * Set and access array elements by index
 * Iterate over array (array traversal)
 */
public class Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");

        //With predefined size: new int[10]
        int[] predefinedIntArray = new int[10];

        //With size defined in a variable: int[size]
        int size = 100;
        double[] sizeDefinedArray = new double[size];

        //Use different types for array elements (int, double, String, char, boolean).
        String[] literalStringArray = {"Red", "Green", "Black", "White", "Blue", "Yellow", "Pink"};

        //Literal array creation: int[] arr = {1, 4, 2, ...}
        char[] literalCharArray = {'K', 'L', 'M', 'N', 1, 2, 3, 4};

        //Use different types for array elements (int, double, String, char, boolean).
        boolean[] literalBooleanArray = {false, true, true};

        //Show use of array.length
        System.out.println("Here is the length of the first array: " + predefinedIntArray.length);
        System.out.println("Here is the length of the second array: " + sizeDefinedArray.length);
        System.out.println("Here is the length of the third array: " + literalStringArray.length);
        System.out.println("Here is the length of the fourth array: " + literalCharArray.length);
        System.out.println("Here is the length of the fifth array: " + literalBooleanArray.length);

        //Assign value to array element: a[4] = 45
        int[] array = {25, 30, 35, 40, 45};

        //Print array element value: ...println("5th element value: " + a[4])
        System.out.println("Here is the fifth element of the array: " + array[4]);
        System.out.println("Traverse array by using a for loop: " );

        //Use for loop to traverse an array
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }

        System.out.println();

        //Use while loop to traverse an array
        System.out.println("Traverse array by using a while loop: " );
        int k = 0;
        while (k < array.length) {
            System.out.printf(array[k] + " ");
            k++;
        }

        System.out.println();

        //Use the enhanced for loop to traverse array: for (int value : values) { ... }
        System.out.println("Traverse array by using the enhanced for loop: " );
        for (int value: array) {
            System.out.print(value + " ");
        }
    }
}