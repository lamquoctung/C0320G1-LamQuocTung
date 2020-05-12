package arrayAndMethod.excersice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of Array");
        int input = Integer.parseInt(scanner.nextLine());
        int[] array = new int[input];
        for (int i = 0; i < array.length;i++){
            array[i] = 0;
        }
        System.out.println("Input X is a number to insert: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Input location in a array: ");
        int index = Integer.parseInt(scanner.nextLine());
        if(index <= 1 && index >= array.length){
            System.out.println("Can not input a number X in array");
        }
        array[index] = x;
        System.out.println("Array: " + Arrays.toString(array));
    }
}