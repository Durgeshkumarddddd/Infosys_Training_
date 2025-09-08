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
    
    
    public static void main(String args[]) {
        
        System.out.println("Enter position : ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
    }
}
