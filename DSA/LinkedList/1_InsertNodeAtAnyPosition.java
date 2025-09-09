import java.util.Scanner;

class InsertNodeAtAnyPosition {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head, tail;

    public static void insertData(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
          

        int idx = 1;
        Node curr = head;
        Node prev = head;
        if (pos == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            while (curr != null && idx < pos) {
                prev = curr;
                curr = curr.next;
                idx++;
            }

            prev.next = newNode;
            newNode.next = curr;

            if (curr == null) {
                tail = newNode ;
            }
        
    }
    
    public static void traverseList( Node head ) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of List  : ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter no : ");
            int data = sc.nextInt();
            System.out.println("Enter position : ");
            int pos = sc.nextInt();

            insertData(data, pos);
            traverseList(head);
        }

    }
}
