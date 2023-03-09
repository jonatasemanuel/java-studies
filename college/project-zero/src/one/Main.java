package one;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void hello(int time) {
        System.out.println("Hello dear");
        if (time >= 6 && time <= 12) {
            System.out.println("Good day");
        }
        else if (time > 12 && time <=18) {
            System.out.println("Good afternoon");
        }
        else {
            System.out.println("Good night");
        }
    }

    // when we need a return don't need to void attribute
    public static float average(float a, float b, float c) {
        float averageResult = (a+b+c)/3;
        return averageResult;
    }

    public static void main(String[] args) {

        hello(13);
        hello(12);
        System.out.println("Grade average: " + average(10,3,9));

        // Variables
        int age; // 4bytes
        float weight; // 4bytes

        // double -> precision values
        double velocity; // 8bytes

        char initial = 'L';
        boolean ofAge = true;
        String name ="Mario";

        int lengthString = name.length();
        System.out.println("The string has:" + lengthString + " characters");

        // Arithmetical operation
        int result;
        result = 4 + 1;

        // Class Math
        double resPotencia = Math.pow(2,3);
        double resSquareRoot = Math.sqrt(9);

        System.out.println(resPotencia);
        System.out.println(resSquareRoot);

        // Keyboard input, uses Scanner class
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type your age:");
        age = keyboard.nextInt();

        System.out.println("Type your height:");
        float height = keyboard.nextFloat();

        System.out.println("Type your name: ");
        name = keyboard.next(); // to string using only next

        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Thanks " + name);

        // Logical operators
        if (age < 18) {
            System.out.println("Minor age");
            System.out.println("You can't see the content");
        }
        else if (age < 65) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Old");
        }

        while (age > 0) {
            System.out.println("Age: " + age);
            age--; // age -= 1
//            age++; -> age  += 1
        }

        for(int i=0 ; i < 10 ; i++){
            System.out.println("Value: " + i);
        }

        // Arrays -> int [] arrayName = {4, 9, 8}
        int [] grades = new int[3]; // int[3] is de qty of numbers on array
        grades[0]=4;
        grades[1]=9;
        grades[2]=8;

        // For each -> "for n in list"
        for (int n : grades) {
            System.out.println(n);
        }

        // || -> or, && -> and
        int age1 = 34;
        if (age1 > 18 || age1 < 65) {
            System.out.println("in range");
        }

        // Boolean statements
        boolean allowedAccess = true;



    }
}


// " " -> string
// ' ' -> char