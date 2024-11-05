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
public class Program12 {
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
    private static Node insertBeforX(Node head,int value ,int element)
    {
        if(head == null)
        {
            return null;
        }
        if(head.data == value)
        {
            return new Node(element,head);
        }

        Node temp = head;
        while(temp.next!=null)
        {

            if(temp.next.data==value)
            {
                Node newNode = new Node(element);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,25,40};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = insertBeforX(head,40,30);
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
