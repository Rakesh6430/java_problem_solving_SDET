//Print the table of a number input given by user
import java.util.Scanner;
public class ForLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of for table: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid Number");
        }
        else{
            for( int i = 1; i <= 10; i++){
                int multiple = n * i;
                System.out.println(multiple+" = "+n+" x "+i);
            }
        }
        sc.close();
    }
}


/*
 2 = n * i;
 2 = 2 * 1;
 4 = 2 * 2,
 6 = 2 * 3,
 8 = 2 * 4;
10 = 2 * 5;
12 = 2 * 6;
14 = 2 * 7;
16 = 2 * 8;
18 = 2 * 9;
20 = 2 * 10;
*/