class Node
{
    int data;
    Node next;
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    Node(int data)
    {
        this.data =data;
    }
}
public class Program10 {
    private static Node convertArrtoLL(int[]arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node insertEnd(Node head,int element)
    {
        if(head==null)
        {
            return new Node(element);
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,40};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = insertEnd(head,50);
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}
