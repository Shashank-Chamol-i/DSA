class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data =data;
    }
}
public class Program08 {
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
    private static Node removeElement(Node head,int element)
    {
        if(head == null) return head;

        if(head.data==element)
        {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node pev = null;
        while(temp!=null)
        {
            if(temp.data == element)
            {
                pev.next = pev.next.next;
            }
            pev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,44,40};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = removeElement(head,44);
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}

