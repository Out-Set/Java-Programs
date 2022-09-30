public class Program4_SwapTwoNumbers {
    public static void main(String[] args) {

        // With the help of third variable
        int n1 = 23;
        int n2 = 34;
        System.out.println("Before swap: n1 = "+n1+", n2 = "+n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swap: n1 = "+n1+", n2 = "+n2);

        System.out.println();
        
        // Without the help of third variable
        System.out.println("Before swap: n1 = "+n1+", n2 = "+n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swap: n1 = "+n1+", n2 = "+n2);
    }
}
