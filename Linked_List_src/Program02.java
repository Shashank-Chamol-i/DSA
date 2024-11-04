/*class Node
{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;

    }
    Node(int data)
    {
        this.data = data;
    }
}
public class Program02 {
    private static Node convertArrtoLL(int[]arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 0;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[]arr = {10,22,46,89};
        Node head = convertArrtoLL(arr);
        System.out.println(head.data);

    }
}

 */
