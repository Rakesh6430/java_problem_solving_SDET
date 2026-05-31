import java.util.*;
public class countDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        while(number > 0){
            //int digit = number % 10;
            number = number/10;
            count++;
        }
        System.out.println();
        System.out.println("The count of the digits are : "+count);
        sc.close();
    }
}


/*
173 
digit = 173%10 = 3
number = 173/10 = 17
count++;


17%10 = 7
number = 17/10 = 1
count++; 

1%10 = 1
number =1/10 = 0
count++  */