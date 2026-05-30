import java.util.Scanner;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col: ");
        int col = sc.nextInt();
        int number[][] = new int[row][col];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("The output of the array will be : ");
        for(int i = 0; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.println("["+i+"]["+j+"]"+"="+number[i][j]);
            }
        }

        sc.close();
    }
}