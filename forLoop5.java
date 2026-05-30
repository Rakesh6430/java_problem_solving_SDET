//Make a function to multiply 2 numbers and return the product
import java.util.Scanner;
public class forLoop5 {
    public static int calcProduct(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second Number :");
        int b = sc.nextInt();

        int product = calcProduct(a,b);
        System.out.println("The Product of two Numbers is : "+ product);
        sc.close();
    }
}