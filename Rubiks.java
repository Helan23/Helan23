import java.util.Scanner;

public class Rubiks {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = in.nextInt();
        int value = n * n * 6;
        System.out.println("The total numberof stickers are " + value);
        in.close();
    }
}