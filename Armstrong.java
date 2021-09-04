import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        int n, originalnum, r, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        n = in.nextInt();
        originalnum = n;
        while (originalnum != 0) {
            r = originalnum % 10;
            sum = (int) (sum + Math.pow(r, 3));
            originalnum = originalnum / 10;
        }
        if (sum == n)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
        in.close();

    }
}
