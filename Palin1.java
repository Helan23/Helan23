import java.util.Scanner;

class Palin1 {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        in.close();

    }
}