package javalang.practice;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student: ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i=0;i<student.length;i++){
            if (student[i].equals(input_name)) {
                System.out.println("Position of the student " + input_name + " is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found" + input_name + " in the list. ");
    }
}
