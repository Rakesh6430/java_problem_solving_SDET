import java.util.Scanner;
public class countCharacter {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        //char charArray[] = new char[word.length()];
        
        for(int i = 0 ; i<= word.length()-1 ; i++){
            count++;
        }
        System.out.println("Character Count is : "+count);
        sc.close();
    }
}
