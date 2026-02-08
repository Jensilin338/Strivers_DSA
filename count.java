public class count {
    public static void main(String[] args) {
        int n = 10;
        int count =0;
        int temp = n;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        System.out.println("The number " +n +" has " +count+ " digits.");
    }
}
