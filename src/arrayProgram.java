//Alyxandra Harp

import java.util.Scanner;

public class arrayProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read:  ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        arrayInput(n, numbers, input);
        averageCall(numbers);
        System.out.println("The average is...  " + averageCall(numbers));
        System.out.print("The contents of the array: ");
        arrayCall(numbers);
    }

    public static void arrayInput(int n, int[] numbers, Scanner input) {
        System.out.print("Enter " + n + " elements:  ");
        for (int i = 0; i < n; i++) { 
            numbers[i] = input.nextInt(); //instead of n you had to use i 
        }
    }

    public static double averageCall(int... numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        return avg;
    }

    public static void arrayCall(int... numbers) {

        System.out.println(java.util.Arrays.toString(numbers));
    }

}

//this is ready for submission
//lets look at the attendance 7
