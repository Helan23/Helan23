import java.util.Scanner;

public class Concat {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the firstname");
        String firstname = in.nextLine();
        System.out.println("Enter lastname");
        String lastname = in.nextLine();
        System.out.println(firstname.concat(lastname));
        in.close();
    }
}
