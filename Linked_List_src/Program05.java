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
        this.data = data;
    }
}
public class Program05
{
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
    private static Node deleteHead(Node head)
    {
        if(head==null) return head;
        Node temp = head;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int[]arr = {10,20,30,40};
         Node head = convertArrtoLL(arr);
        System.out.println(head.data);
        head = deleteHead(head);
        System.out.println(head.data);


    }
}