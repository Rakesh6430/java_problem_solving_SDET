import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char charArray[] = new char[name.length()];
        charArray = name.toCharArray();

        System.out.println("The Reversed String is : ");
        for(int i = name.length() - 1; i>= 0; i--){
            System.out.print(charArray[i]);
        }
        sc.close();
    }
}
