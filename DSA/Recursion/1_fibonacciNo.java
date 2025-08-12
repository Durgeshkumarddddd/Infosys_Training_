import java.util.Scanner;

class Fibonacci {

    public static int findFibonaci(int n){
        if ( n == 0){
            return 0;
        }
        if ( n == 1 ){
            return 1 ;
        }
        int f1 = findFibonaci( n-1 ) ;
        int f2 = + findFibonaci(n - 2);
        return f1 + f2 ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci no: ");
        // int n = sc.nextInt();
        int n = 7;
      int NthFibonacci =   findFibonaci(n);
      
      System.out.println(NthFibonacci);

    }
}