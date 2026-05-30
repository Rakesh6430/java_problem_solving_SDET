//Print the Sum of First n natural numbers
//such as, n=4, 1+2+3+4;
import java.util.Scanner;
public class forLoop3 {
    public static void main(String[] args) {
        int n = 0, sum = 0 ;
        System.out.print("Enter the n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            sum = sum + i ;
        }
        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
        sc.close();
    }
    
}

/*
  n = 1;
  sum = sum + 1;
    n = 1, 1 = 0 + 1;
    n = 2 ,3 = 1 + 2;
    n = 3 , 6 =  3 + 3;
    n = 4, 10 =  6 + 4; 


*/
