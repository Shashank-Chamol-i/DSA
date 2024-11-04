class Node
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
public class Program04 {
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
    private static int countLength(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    private static int search(Node head , int element)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == element)
            {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]arr = {10,22,46,89};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            //System.out.println(temp.data+ " ");
            temp = temp.next;
        }
      //  System.out.println(countLength(head));
        //System.out.println(head.data);
        System.out.println(search(head,46));

    }
}

