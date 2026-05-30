
import java.util.Scanner;

public class ifElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("The age is : "+ age);

        if(age < 1){
            System.out.println("Not a valid age");
        }
        if(age > 18){
            System.out.println("Adult");
        }
        else if(age >= 1 ){
            System.out.println("Not Adult");
        }
        sc.close();
    }
}