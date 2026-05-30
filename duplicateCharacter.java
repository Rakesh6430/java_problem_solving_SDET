import java.util.Scanner;

public class duplicateCharacter {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        char charArray[] = new char[word.length()];
        charArray = word.toCharArray();
        for(int i = 0; i< word.length(); i++ ){
            for(int j = i+1 ; j< word.length() ; j++){
                if(charArray[i]==charArray[j]){
                    count++;
                    break;
                }
            }
            
        }
        if(count == 0){
            System.out.println("There is no duplicate character in the word");
        }
        else{
            System.out.println("There is duplicate character in the word ");
        }
        sc.close();
    }
}
