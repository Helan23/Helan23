import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String orginal, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        orginal = in.nextLine();
        int length = orginal.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + orginal.charAt(i);
        }
        System.out.println("Reversed string is " + reverse);
        in.close();
    }
}
