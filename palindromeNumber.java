import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        String numString = Integer.toString(number);
        char numArray[] = new char[numString.length()];
        numArray = numString.toCharArray();
        char reverseArray[] = new char[numString.length()];

        System.out.print("The reverse Array is : ");
        for(int i = numString.length() -1,j=0 ; i >=0; i--,j++){
            reverseArray[j] = numArray[i];
            System.out.print(reverseArray[j]);
        }
        System.out.println();
        System.out.print("Palindrome Checking : ");
        for(int i = 0, j=0; i < numString.length() ; i++,j++){
            if(reverseArray[j] != numArray[i]){
                count = 0;
                break;
            }
            else{
                count++;
            }
        }
        if(count == 0){
            System.out.println("The number is not palindrom");
        }
        else{
            System.out.println("The number is palindrom");
        }

        
       
        sc.close();
    }
}
