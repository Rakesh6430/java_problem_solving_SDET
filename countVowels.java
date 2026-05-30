import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String word = sc.nextLine();
        char charArray[] = new char[word.length()];
        charArray = word.toCharArray();
        for(int i = 0; i <= word.length() - 1 ; i++){
            if(Character.toString(charArray[i]).equals("a") || Character.toString(charArray[i]).equals("e") || Character.toString(charArray[i]).equals("i") || Character.toString(charArray[i]).equals("o") || Character.toString(charArray[i]).equals("u") ){
                count++;
                continue;
            }
            
        }
        if(count == 0){
            System.out.println("There is no vowels in the word");
        }
        else{
            System.out.println("The count of vowels in the word : "+count);
        }
        
        sc.close();

    }
}
