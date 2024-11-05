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
public class Program11 {
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
    private static Node insertKposiion(Node head,int k ,int element)
    {
        if(head == null)
        {
            if(k==1)
            {
                return new Node(element);
            }else {
                return null;
            }
        }
        if(k==1)
        {
            Node temp = new Node(element,head);
            return temp;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            if(count==k-1)
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
        int[]arr = {10,20,30,40};
        Node head = convertArrtoLL(arr);
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = insertKposiion(head,3,25);
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
