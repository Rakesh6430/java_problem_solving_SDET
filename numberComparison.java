import java.util.Scanner;

public class numberComparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : " );
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("The two numbers are equal");
        }
        else if(a < b){
            System.out.println(b+ " is greater");
        }
        else{
            System.out.println(a + " is greater");
        }
        sc.close();

    }
}
