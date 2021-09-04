import java.util.Scanner;

class Equal {
    public static void main(String args[]){
    Scanner ob1 = new Scanner(System.in);
    int m,n;
    System.out.println("Enter the first number");
    m=ob1.nextInt();
    System.out.println("Enter the second number");
    n=ob1.nextInt();
    if(m==n)
    {
        System.out.println("They are equal");
    }
    else{
        System.out.print("They are not equal");
    }
    ob1.close();
    }
}
