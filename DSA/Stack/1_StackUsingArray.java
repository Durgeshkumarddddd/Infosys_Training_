
import java.util.*;

class StackUsingArray {
    public int[] st = new int[5];
    int i = - 1 ;

    public void push(int data){
        i++;
        st[i] = data ;
    }

    public int pop (){
        int data = st[i];
        i--;
        return data ;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        StackUsingArray m = new StackUsingArray();

        // use menue driven architecture for stack push and pop implemented by array
        int k ;
        do {
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop ");
            System.out.println("0 for stop ");
            System.out.println("Enter number : ");
             k = sc.nextInt();

            if (k == 1 ){
                if ( m.i >= 5){
                    System.out.println("Stack is full ");
                    continue;
                }
                System.out.println("Enter No want to push");
                int data = sc.nextInt();
                m.push(data);
            }
            else if (k == 2 ){
               System.out.println( m.pop());
                
            }
            else {
                System.out.println("Invalid no : ");
            }
    
        }while (k != 0);
        sc.close();
    }

    
}
