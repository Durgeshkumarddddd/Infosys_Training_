import java.util.Scanner;

class QueueUsingStack {
    int s1[] = new int[5];
    int s2[] = new int[5];
   static int i = -1;
   static int j = -1;

   public void enque(int data) {
       if (i == -1) {
           i++;
           s1[i] = data;
           return;
       }
       while (i >= 0) {
           s2[++j] = s1[i];
           i--;
       }
       s1[++i] = data;
       while (j >= 0) {
           s1[++i] = s2[j--];
       }
   }

   public int deque() {
       int data = s1[i];
       i--;
       return data;
   }

   public static void main(String args[]) {
        
         Scanner sc = new Scanner(System.in);
        QueueUsingStack q = new QueueUsingStack();
        int n ;
        do {
            System.out.println("Enter 1 for insert element : ");
            System.out.println("Enter 2 for remove element : ");
            System.out.println("Enter 0 for stop the Queue : ");
            System.out.println("Enter choice : ");
            n = sc.nextInt();

            if (n == 1) {
                if (i >= 4) {
                    System.out.println("Queue is Full !");
                    continue;
                }
                System.out.println("Enter no want to insert : ");
                int data = sc.nextInt();
                q.enque(data);
            }

            if (n == 2) {
                if (i == -1) {
                    System.out.println("Queue is Empty ! ");
                    continue;   
                }
                System.out.println("Deleted "+q.deque());
            }
        }while(n != 0 );
    }
}
