import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num, temp, rev = 0, rem;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
