//Write a Java Program to Print the sum of digits of a given number

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println(sum);
        sc.close();
    }
}

/*

173 = 1 + 7 + 3 

digit = 173%10 = 3
sum = sum + digit; = 0 + 3
number = 173/10; = 17

digit = 17%10 = 7
sum = sum + digit = 0+ 3 + 7
number = 17/10 = 1


digit = 1%10 = 1
sum = sum + digit = 0 + 3 + 7 + 1
number = 1/10;


*/