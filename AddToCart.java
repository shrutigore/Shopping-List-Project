import java.util.*;
public class AddToCart {
	Node head;
    static class Node{

        String itemName;
        double price;
        Node next;

        Node(String itemName,double price){
            this.itemName=itemName;
            this.price =price ;
            next= null;
        }

    }

    public AddToCart createCart (AddToCart list , String itemName , double price ){

        Node newNode = new Node(itemName,price);
        if(list.head==null){
            list.head = newNode;
        }
        else{
            Node currnode;
            currnode = list.head;
            while(currnode.next!=null){
                currnode = currnode.next;
            }
            currnode.next= newNode;
        }
        return list;
    }
    public static AddToCart deleteANode(AddToCart list){
    	Scanner sc2 = new Scanner(System.in);
    	System.out.println("\n Enter the element which you want to delete");
    	String itemName = sc2.nextLine();

    	if(list.head==null){
    	System.out.println("\n The cart is empty");
    	}
    	else
    	if(list.head.itemName.compareToIgnoreCase(itemName)==0 && list.head.next == null){
    	System.out.println("This is the only item in the cart");
    	   list.head=null;
    	}
    	else if(list.head.itemName.compareToIgnoreCase(itemName)==0 && list.head.next!=null)
    	{ // System.out.println("\n The head node will change");
    	Node temp ;
    	temp = list.head ;
    	temp = temp.next;
    	list.head.next=null;
    	list.head=temp;

    	}
    	else{
    	Node currnode;
    	currnode = list.head;
    	if(currnode.next.itemName.compareToIgnoreCase(itemName)!=0){
    	System.out.println("\n The item is not present in singly linked list");
    	}

    	while(currnode.next!=null && currnode.next.itemName.compareToIgnoreCase(itemName)==0){
    	currnode = currnode.next;
    	}
    	Node temp1;
    	temp1 = currnode.next;
    	if(temp1.next == null){
    	currnode.next=null;
    	}
    	else{
    	currnode.next = temp1.next;
    	temp1.next=null;
    	}
    	}
    	Node currnode;
    	currnode = list.head;
    	      System.out.println("The cart after deletion of the item is = ");
    	while(currnode !=null){
    	System.out.println(currnode.itemName);
    	currnode = currnode.next;
    	}

    	return list;
    	}

    

}
