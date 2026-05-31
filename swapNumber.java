import java.util.Scanner;
public class swapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int secondNumber = sc.nextInt();
        swap(firstNumber,secondNumber);
        sc.close();
    }
    public static void swap(int firstNumber, int secondNumber){
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping the numbers: "+ firstNumber +" & "+ secondNumber);
        
    }
}
