public class rev {
    public static void main(String[] args) {
        int num1 = 12345;
        int rev =0;
        while(num1!=0){
            int digit = num1 % 10;
            rev = rev*10 + digit;
            num1 = num1/10;
        }
        System.out.println(rev);
       
    }    
}
