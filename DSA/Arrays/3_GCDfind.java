/* 
 ✅ What is GCD?
GCD stands for Greatest Common Divisor (also called HCF – Highest Common Factor).
It is the largest number that divides two (or more) numbers exactly without leaving a remainder.

🔢 Example:
Let’s say you have two numbers: 24 and 36

Factors of 24 = 1, 2, 3, 4, 6, 8, 12, 24

Factors of 36 = 1, 2, 3, 4, 6, 9, 12, 18, 36

✅ Common factors = 1, 2, 3, 4, 6, 12

👉 So, GCD(24, 36) = 12

✅ Method 1: Using Euclidean Algorithm (Most Efficient)
 class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder becomes new b
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 24, b = 36;
        System.out.println("GCD is: " + gcd(a, b)); // Output: 12
    }
} 

Method 2: Using Recursion

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 24, b = 36;
        System.out.println("GCD is: " + gcd(a, b)); // Output: 12
    }
}
 */

// 3 method 

class FindGCD {

    static int gcd(int a , int b){
        while ( a != b ){
            
            if (a < b){
                b = b - a ;
            }
            else {
                a = a - b ;
            }
        }
        return a ;
    }
    public static void main(String... s){
        
        int a = 5 ;
        int b = 20 ;

        // it is for two numbers 
        
        a = gcd( a, b);

        System.out.println(a);

        // now for array of elements or multiple no.

        int []arr = {20,10,40,50,60};
        int k = arr[0] ;
        for (int i = 0 ; i < arr.length ; i++){
            k = gcd(k, arr[i]);
        }
        System.out.println(k);

    }
}
