import java.util.Scanner;

public class Name {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = in.nextLine().toUpperCase();
        // String newName = name.toUpperCase();
        System.out.println("Hello" + " " + name + " " + '!');
        in.close();
    }
}
