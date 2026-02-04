public class count {
    public static void main(String[] args) {
        int n = 1234;
        int temp = n;   // store original number
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("The number " + n + " has " + count + " digits.");
    }
}
