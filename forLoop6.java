//Find the factorial of a number
import java.util.Scanner;
public class forLoop6 {
    public static int calcFactorial(int a){
        int factorial = 1;
         if(a < 0){
            System.out.println("The number is invalid");
            return factorial ;
        }
        else if(a == 0){
            System.out.println("The factorial of "+a+ " is: "+ factorial);
            return factorial;
        }
        else{
            for(int i = 1; i <= a ; i++){
            factorial = factorial * i;
            }
            System.out.println("The factorial of "+a+ " is: "+ factorial);
            return factorial;
        }

       
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        calcFactorial(a);
        //int factorial = calcFactorial(a);
        sc.close();

    } 
}


/*
1! = 1*1;
2! = 2*1;
3! = 3*2*1;
4! = 4*3*2*1;
i = 1; 1*1
i = 2; 2*1*1;
i = 3; 3*2*1*1; 
i = 4; 4*3*2*1*1;

 */