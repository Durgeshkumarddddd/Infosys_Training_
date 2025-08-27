import java.util.Scanner;

class Queue {
    int arr[] = new int[5];
   static int front = -1;
   static int rare = -1;

    public void enque(int data) {

        if (rare == -1) {
            front = rare = 0;
            arr[rare] = data;
            return;
        }
        rare++;
        arr[rare] = data;
    }

    public int deque() {
        int data = arr[front];
        front++;
        return data;
    }


    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n ;
        do {
            System.out.println("Enter 1 for insert element : ");
            System.out.println("Enter 2 for remove element : ");
            System.out.println("Enter 0 for stop the Queue : ");
            System.out.println("Enter choice : ");
            n = sc.nextInt();

            if (n == 1) {
                if (rare >= 4) {
                    System.out.println("Queue is Full !");
                    continue;
                }
                System.out.println("Enter no want to insert : ");
                int data = sc.nextInt();
                q.enque(data);
            }

            if (n == 2) {
                if (front == rare) {
                    System.out.println("Queue is Empty ! ");
                    continue;   
                }
                System.out.println("Deleted "+q.deque());
            }
        }while(n != 0 );
    }
}
