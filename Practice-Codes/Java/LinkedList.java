class LL
{
    Node head = null;
    Node tail = null;
    
    public void insertLast(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else
        {
            tail.next=nn;
            tail=nn;
        }
    }
    public void insertFirst(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        insertLast(data);
        else
        {
            nn.next = head;
            head = nn;
        }
    }
    public void display()
    {
        Node temp_head = head;
        while(temp_head!=null)
        {
            System.out.print(temp_head.data+" ");
            temp_head=temp_head.next;
        }
    }
    public static void main(String[] args) 
    {
        LL obj = new LL();
        obj.insertLast(10);
        obj.display();
        System.out.println();
        obj.insertLast(20);
         obj.display();
        System.out.println();
        obj.insertLast(30);
         obj.display();
        System.out.println();
        obj.insertLast(40);
         obj.display();
        System.out.println();
        obj.insertLast(50);
        obj.display();
        System.out.println();
        obj.insertFirst(30);
         obj.display();
        System.out.println();
        obj.insertFirst(40);
         obj.display();
        System.out.println();
        obj.insertFirst(50);
        obj.display();
    }
}
class Node
{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
