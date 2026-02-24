public class count {
    public static void main(String[] args) {
        int n = 1000;
        int count =0;
        int temp = n;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("The number has " +count+ " digits.");
    }
}
