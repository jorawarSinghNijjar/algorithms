public class Main {
    public static void main(String[] args) {
//        print(1);
        System.out.println(fibo(5));
    }



    // Print 1 to 5 recursively
    private static void print(int n) {
        System.out.println(n);
        if(n == 5) return;
        print(n+1);
    }

    // Fibonacci numbers
    private static int fibo(int n) {
//        if(n == 0) return 0;
//        if(n == 1) return 1;
        // Better way of writing same thing
        if( n < 2) return n;

        return fibo(n-1) + fibo(n-2);
    }


}
