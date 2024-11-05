class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
public class Program07 {
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
    private static Node removeK(Node head,int k)
    {
        if(head == null) return head;
        if(k==1)
        {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prv = null;
        int count = 0;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                prv.next = prv.next.next;
            }
            prv = temp;
            temp = temp. next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,66,50};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        head = removeK(head,5);
        Node temp1 = head;
        while(temp1!=null)
        {
            System.out.print(temp1.data+" ");
            temp1 = temp1.next;
        }


    }
}
