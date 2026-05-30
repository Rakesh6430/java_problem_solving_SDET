import java.util.Scanner;
public class switchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select a button : ");
        int button = sc.nextInt();

        switch(button){
            case 1 : {
                System.out.println("Greetings");
                break;
            }

            case 2: {
                System.out.println("Hello");
                break;
            }

            case 3: {
                System.out.println("Bonjour");
                break;
            }
            default : {
                System.out.println("Invalid Button"); 
            } 
        }
        sc.close();

    }
}