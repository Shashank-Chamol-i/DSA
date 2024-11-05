class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
public class Program06 {
    private static Node convertArrToLL(int[]arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node deleteTail(Node head)
    {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,99};
        Node head = convertArrToLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("--------------------------------");
        head = deleteTail(head);
        System.out.println(head.data);
        System.out.println("------------------------------------");
        Node temp1 = head;
        while(temp1!=null)
        {
            System.out.println(temp1.data+ " ");
            temp1 = temp1.next;

        }

    }
}

