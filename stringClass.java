public class stringClass {
    public static void main(String[] args) {
        String firstName = "Rakesh";
        String lastName = "Paul";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //Character at
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
}
