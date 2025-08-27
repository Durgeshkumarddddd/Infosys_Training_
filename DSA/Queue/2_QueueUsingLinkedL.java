import java.util.*;

class QueueUsingLinkedList {
    
    class xxx {
        int data;
        xxx ad;
    }

   static xxx front , rare , q;

    public void enque(int data) {
        if (rare == null) {
            q = new xxx();
            rare = q;
            rare.data = data;
            front =  rare;
            return;
        }
        q = new xxx();
       
        q.data = data;
        rare.ad = q;
        rare = q;

        /* best to use this 
         Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        
        if (rear == null) {
            front = rear = newNode; // First element
        } else {
            rear.next = newNode; // Link last node to new node
            rear = newNode;      // Update rear
        }
         */

    }
    
    public int deque() {
        int data = front.data;
        front = front.ad;
        return data;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        QueueUsingLinkedList m = new QueueUsingLinkedList();
        int n ;
        do {
            System.out.println("Enter 1 for insert : ");
            System.out.println("Enter 2 for remove: ");
            System.out.println("Enter 0 for stop : ");
            System.out.println("Enter choice : ");
             n = sc.nextInt();
             if (n == 1) {
                
                 System.out.println("enter element to insert : ");
                 int data = sc.nextInt();
                 m.enque(data);
             }
             else if (n == 2) {
                 if (front == null) {
                     System.out.println("Queue is Empty !");
                     continue;
                 }
                 System.out.println("Deleted element :"+ m.deque());
            }
        } while (n != 0);
    }
}
