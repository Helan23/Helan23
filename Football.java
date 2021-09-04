import java.util.Scanner;

public class Football {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the wins");
        int win = in.nextInt();
        System.out.println("Enter the draws");
        int draws = in.nextInt();
        System.out.println("Enter the loss");
        int loss = in.nextInt();
        int sum = (win * 3) + (draws * 1) + (loss * 0);
        System.out.println("The value is " + sum);
        in.close();
    }
}
