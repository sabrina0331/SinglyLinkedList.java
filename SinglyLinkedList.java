// Create a SinglyLinkedList class like the above.
public class SinglyLinkedList {
    public Node head;
//Create a constructor method that sets
//the head to null of your SinglyLinkedList objects
    public SinglyLinkedList() {
        this.head = null;
    }
// SLL methods go here. As a starter, we will show you how to add a node to the list.
    public SinglyLinkedList add(int value){
    Node newNode = new Node(value);
    if(head == null) {
        head = newNode;
    } else {
        Node runner = head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
        }   
        
        return this;
    }
    public void printValues(){
        Node runner = this.head;
        while(runner.next != null) {
            System.out.println(runner.value);
            runner = runner.next;
            
        }
    }  

//Create a remove() method that will remove a node from the end of your list
    public void remove() {
        if(head == null) {
            System.out.println("null");
        }
        Node runner = this.head;
        while(runner.next != null) {
            runner = runner.next;
            if(runner.next.next == null){
                runner.next =null;
                }
            }
        }
    }
        

