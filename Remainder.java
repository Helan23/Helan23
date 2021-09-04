import java.util.Scanner;

class Remainder {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = in.nextInt();
        System.out.println("Enter the second value");
        int b = in.nextInt();
        int result = a % b;
        System.out.println("The remainder is " + result);
        in.close();
    }
}