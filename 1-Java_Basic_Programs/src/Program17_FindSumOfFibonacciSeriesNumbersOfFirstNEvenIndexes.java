// Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
public class Program17_FindSumOfFibonacciSeriesNumbersOfFirstNEvenIndexes {
    public static void main(String[] args) {
        SumOfFirstNEvenFibonacciNumber.fib(10);
    }
}

class SumOfFirstNEvenFibonacciNumber{
    static void fib(int num){
        int a = 0, b = 1, temp = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<=num; i++){
            System.out.println(b+a);
            temp = a;
            a = b;
            b = temp;   
        }
    }
}