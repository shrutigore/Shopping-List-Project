import java.util.*;
public class Customer {
	


	     Node head;

	     static class Node {

	         String name;
	         long phoneNumber;
	         String address;
	         Node next;
	         AddToCart cart;

	         Node() {
	             this.name = " ";
	             this.phoneNumber = 0;
	             this.address = " ";
	             this.next = null;
	             cart=new AddToCart();
	         }
	     }

	     public void createNewCustomer(Customer list, String name, long phoneNumber, String address) {


	         Node newnode = new Node();
	         newnode.name = name;

	         newnode.phoneNumber = phoneNumber;
	         newnode.address = address;
	         if (list.head == null) {
	             list.head = newnode;
	         } else {
	             Node currnode;
	             currnode = list.head;
	             while (currnode.next != null) {
	                 currnode = currnode.next;
	             }
	             currnode.next = newnode;
	             newnode.next = null;
	         }
	     }

	     public static String checkExistingCustomer(Customer list) {
	         Scanner input = new Scanner(System.in);
	         Node currnode;
	         currnode = list.head;

	         if (list.head == null) {
	             System.out.println("\n Oops!! We couldn't find your details , Please do create a new account");
	         } else {
	             System.out.println("\n Enter your full name");
	             String name1 = input.nextLine();


	             while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name1) != 0)) {
	                 currnode = currnode.next;
	             }

	             if (currnode.name.compareToIgnoreCase(name1) == 0) {

	                 System.out.println("Do Check your details ");
	                 System.out.println();
	                 System.out.println("Name is: " + currnode.name);
	                 System.out.println("Phone Number : " + currnode.phoneNumber);
	                 System.out.println();
	                 System.out.println("Address : " + currnode.address);
	                 return currnode.name;
	             } else {
	                 System.out.println("Oops please create a new account");
	             }

	         }
	         return " ";
	     }

	     public void displayCart(Customer list, String name) {
	         if (name != " ") {
	             int temp=1;
	             int ch, choice;
	             Scanner sc1 = new Scanner(System.in);
	             Node currnode;
	             currnode = list.head;
	             System.out.println("************WELCOME TO DS MART***************");
	             do {

	                 
	                 System.out.println("1.Cosmetics (Make-up Kit)          Rs 2500");
	            	 System.out.println("2.Designer Masks                   Rs 100  "+ "\t\t\t "+"_____"+"\n\t\t\t\t\t\t\t     --<:_____:>--");
//	            	 System.out.println();
//	            	 System.out.println("    _____");
//	            	 System.out.println("--<:_____:>--");
	            	 System.out.println();
	            	 System.out.println("3.T-shirts                         Rs 599");
	            	 System.out.println();
	            	 System.out.println("___|  |__");
	            	 System.out.println("___    ___");
	            	 System.out.println("  |    | ");
	            	 System.out.println("  | :) |");
	            	 System.out.println("  |____|"); 
	            	 System.out.println();
	            	System.out.println("4.Dresses                           Rs 2999");
	            	 System.out.println("5.Trousers                         Rs 999");
	            	 System.out.println();
	            	 System.out.println("  ______  ");
	            	 System.out.println("  |    | ");
	            	 System.out.println("  | /\\ | ");
	            	 System.out.println("  | || |  ");
	            	 System.out.println("  | || |  ");
	            	 System.out.println();
	            	System.out.println("6.Sweat-Shirts                      Rs 799");
	            	 System.out.println("7.Skirts                           Rs 1000");
	            	System.out.println("8.Tops                              Rs 1000");
	            	System.out.println("9.Handbags                          Rs 3000");
	            	System.out.println();
	            	System.out.println("  ____");
	            	System.out.println("_(____)_");
	            	System.out.println("|   *   |");
	            	System.out.println("|___*___|");
	            	System.out.println();
	            	 System.out.println("10.Shoes                           Rs 2500");
	            	 System.out.println("11.Jewellery                       Rs 4500");
	            	 System.out.println();
	            	 System.out.println(" |   | ");
	            	 System.out.println("(*) (*)");
	            	 System.out.println();
	            	 System.out.println("12.Watches                         Rs 2500 ");
	            	 System.out.println();
	            	 System.out.println("     _____");
	            	 System.out.println("----|  |  |----");
	            	 System.out.println("----|__/__|----");
	            	 System.out.println();
	            	 System.out.println("13.Cell-Phones                     Rs 50000");
	            	 System.out.println("14.Toys                            Rs 2500");
	            	 System.out.println("15. Exit Shopping");


	                 System.out.println("Enter your temptation");
	                 ch = sc1.nextInt();

	                 switch (ch) {

	                     case 1:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }
	                         

	                         currnode.cart.createCart(currnode.cart,"cosmetics",2000);
	                         break;
	                     case 2:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Designer mask",100);
	                         break;
	                     case 3:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"T shirt",599);
	                         break;
	                     case 4:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"dresses",1999);
	                         break;
	                     case 5:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Trousers",999);
	                         break;
	                     case 6:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Sweat Shirts",799);
	                         break;
	                     case 7:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Skirts",1000);
	                         break;
	                     case 8:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Tops",1000);
	                         break;
	                     case 9:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Hand Bags",3000);
	                         break;
	                     case 10:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Shoes",2500);
	                         break;
	                     case 11:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Jewellery",4500);
	                         break;
	                     case 12:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Watches",2500);
	                         break;
	                     case 13:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Cell Phones",50000);
	                         break;
	                     case 14:
	                         while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                             currnode = currnode.next;
	                         }

	                         currnode.cart.createCart(currnode.cart,"Toys",2500);
	                         break;
	                         

	                     case 15:
	                         temp = 0;
	                         break;

	                 }

	             } while (temp!=0);


	         }


	     }






	     public static void displayFullCart(String name,Customer list) {
	         Node currnode = list.head;
	         double total = 0;
	         if (list.head == null) {
	             System.out.println("cart is empty as no customer identified");
	         } else {
	             while ((currnode.next != null) && (currnode.name.compareToIgnoreCase(name) != 0)) {
	                 currnode = currnode.next;
	             }
	             AddToCart.Node c = currnode.cart.head;
	             System.out.println("your cart is :");
	             while (c != null) {
	                
	                 System.out.println(c.itemName + "  " + c.price);
	                 c = c.next;
	             }
	            int ch , choice;
	            Scanner sc = new Scanner(System.in);
	             do{
	            	 System.out.println("\n1.Delete an item");
	            	 System.out.println("2.Pay bill");
	            	 System.out.println("Enter your choice");
	            	 ch = sc.nextInt();
	            	 
	            	 switch(ch){
	            	 case 1:
	            		  c = currnode.cart.head;
	            		 AddToCart.deleteANode(currnode.cart);
	            	/*	 System.out.println("your cart is :");
	    	             while (c != null) {
	    	                
	    	                 System.out.println(c.itemName + "  " + c.price);
	    	                 c = c.next;
	    	             }
	    	             */
	                 break;
	            	 case 2:
	            		 c = currnode.cart.head;
	            		 total =0;
	            		 while (c != null) {
		            		 //CalculateTotalPrice.add(c.price , total );
                              total = total + c.price;
	    	                 c = c.next;
	    	             }
	            		System.out.println("Your total bill amount is = " + total);
	            		 break;
	            	 
	            		 
	            	 }
	             }while(ch>0 && ch<3);
	             
	             
	         }
	     }
	     
	     
	 }
