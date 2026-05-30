import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word : ");
        String word = sc.nextLine();
        char wordArray[] = new char[word.length()];
        wordArray = word.toCharArray();
        char reversedArray[] = new char[word.length()];
        for(int j=0, i = word.length()- 1 ; i >= 0 ; i--,j++){
            reversedArray[j] = wordArray[i];
            
        }
        System.out.print("The reversed String is : ");
        for(int j =0; j<= word.length() -1 ; j++){
            System.out.print(reversedArray[j]);
        }
        System.out.println();
        System.out.print("The Palindrome Checking : ");
        for(int j=0, i =0 ; i <= word.length() -1 ; i++,j++){
            if(reversedArray[j] != wordArray[i]){
                count = 0;
                break;
                

            }
            else{
                count++;
                continue;
            }

            
        }
        if(count == 0){
            System.out.println("The word is not Palindrome");

        }
        else{
            System.out.println("The word is palindrome");
            System.out.println("The word consists of Letter is : " + count);
        }
        sc.close();

    }
}



/*
civic 
 */