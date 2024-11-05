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
public class Program09 {
    private static Node convertArrtoLL(int[]arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node insertHead(Node head, int element)
    {
        Node temp = new Node(element,head);
        return temp;
    }

    public static void main(String[] args) {
        int[]arr = {20,30,40,50};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = insertHead(head,10);
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}
