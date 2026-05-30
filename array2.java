//Take an array as input from the user. Search for a given number x and print the index at which occurs

import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the numbers for the array : ");
        for(int i = 0 ; i< size ; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number which want to search : ");
        int searchNumber = sc.nextInt();
        for(int i = 0 ; i< size; i++ ){
            if(numbers[i] == searchNumber){
                System.out.println("The index of the searched "+numbers[i]+" number is : "+i);
                break;
            }
            else{
                //System.out.println("The number is not found");
                continue;
            }
        }
        sc.close();

    }
}
