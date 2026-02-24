import java.util.Scanner;
public class euclidGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,gcd;
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD: "+a);
    }
}
