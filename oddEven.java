import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if(number%2 < 0 || number == 0){
            System.out.println(number + " is not valid");
        }
        else if(number%2 == 0){
            System.out.print(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
        sc.close();
    }
}
