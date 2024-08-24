import java.io.*;
import java.util.Scanner;

public class Gradecalculator {
    public static String calculategrade(double average) {
        if (average >= 90) {
            return "O";
        } else if (average >= 85) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B+";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int number = scanner.nextInt();
        double[] marks = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.println("enter the mark of subject" + (i + 1) + "=");
            marks[i] = scanner.nextDouble();
        }
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double averagepercent = total / number;
        String grade = calculategrade(averagepercent);
        System.out.println("\nresult:\n");
        System.out.println("totalmarks=" + total);
        System.out.println("average=" + averagepercent + "%");
        System.out.println("grade=" + grade);
    }

}