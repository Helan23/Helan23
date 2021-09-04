import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        String a, b = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        a = in.nextLine();
        int l = a.length() - 1;
        // int l = n - 1;
        for (int i = l; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        // System.out.println("The string is palindrome");

        if (a.equals(b)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        in.close();
    }
}
