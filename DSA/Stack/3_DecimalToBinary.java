import java.util.Scanner;
import java.util.Stack;
class DecimalToBinary {
    
    public static void main(String s[]){
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Enter Decimal no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while ( n > 0 ){
            int r = n % 2 ;
            stack.push(r);
            n = n / 2 ;
        }

        while ( !stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}
