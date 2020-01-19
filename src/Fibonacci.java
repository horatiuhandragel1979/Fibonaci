/**
 * Created by bery on 12/16/2019.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a = fib(4);     //apelam metoda fib
        System.out.println(a);
    }

    public static int fib(int n){  //metoda

        System.out.println(n);

        if (n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}
