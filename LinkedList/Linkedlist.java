package LinkedList;
import java.util.LinkedList;
public class Linkedlist {
   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    // add node in the first ;
    public  void addFirst(int data){
        Node newNode= new Node(data); 
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add node in the last of linkedlist;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // add node in given index;
   public void Add(int index,int data){
    Node newnNode=new Node(data);
    if(index==0){
        addFirst(data);
        return;
    }
    Node temp=head;
    int i=0;
    while(i<index-1){
        temp=temp.next;
        i++;
    }
    newnNode.next=temp.next;
    temp.next=newnNode;
    }
    public void display(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}
