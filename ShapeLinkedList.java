/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */

/**
 * Class ShapeLinkedList creates a linked list of Shapes,
 * contains head node first node of list
 */
public class ShapeLinkedList {

    public Node head; // Head is first node in linked list
    
    /**
     * Empty class constructor
     */
    public ShapeLinkedList() {
    }
    
    /**
     * Class constructor, receives head Node
     * @param head first node of list
     */
    public ShapeLinkedList(Node head) {
        this.head = head;
    }

    
    /**
     * counts nodes in list
     * @return length of linked list
     */    
    public int length() {
       int count=0;
        if(!isEmpty()){
	        Node cursor=head;
	        count=1;
	        while(cursor.next != null){
	        	count++;
	        	cursor=cursor.next;
	        }       	
        }
        return count;
    }
    
    /**
     * @return last node in list
     */
    public Node tail() {
         return findAtIndex(length()-1);
    }
    
    /**
     * @return true if list is empty, false if not
     */
    public boolean isEmpty() {
       boolean result=true;
    	if(head!=null){
    		result=false;
    	}
       return result;
    }
    
    /**
     * Creates and adds node to the end of list
     * @param data shape to store in new node
     */
    public void insertAtEnd(Shape data) {
        Node newNode=new Node(data);
        Node end=tail();
    	end.next=newNode;
    }
    
	/**
	 * Creates and adds node to the start of list
	 * @param data shape to store in new node
	 */
    public void insertAtBeginning(Shape data) {
        Node newNode=new Node(data);
        Node temp=head;
        newNode.next=temp;
        head=newNode;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String result="LINKED LIST :";
        if(!isEmpty()){
        	result += "-> "+ head;
        }
        return result;
    }
    
    /**
     * Gets node at a specific position in list
     * @param idx position in list
     * @return node found
     */
    Node findAtIndex(int idx) {
        Node found=null;
        if(!isEmpty()){
        	found=head;
        	int counter=0;
        	while(found.next != null && counter != idx){
        		found=found.next;
        		counter++;
        	}
        }
        return found;
    }
    
    /**
     * Remove node from list at a specific position
     * @param idx position of node to remove
     */
    void deleteAtIndex(int idx) {
    	if(!isEmpty()){
    		if(idx==0){
    			head=null;
    		} else{
    			Node PreDelete=findAtIndex(idx-1);
	    		Node Delete=findAtIndex(idx);
	    		PreDelete.next=Delete.next;
    		}
    	}   
    }

    /**
     * Removes node with shape from the list
     * @param s shape to remove
     */
    void deleteData(Shape s) {
        if(!isEmpty()){
        	Node cursor=head;
        	int idx=0;
        	while(cursor != null){
        		if(s.equals(cursor.data)){
        			deleteAtIndex(idx);
        			break;
        		}
        		idx++;
        		cursor=cursor.next;
        	}
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(!(o instanceof ShapeLinkedList)){
			return false;
		}
		
		ShapeLinkedList shapeList = (ShapeLinkedList) o;
		if(!head.equals(shapeList.head)){
			return false;
		}
		return true;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode(){
    	int result;
       	result = (head != null ? head.hashCode() : 0);
    	return result;
    }

    // Node is nested class because it only exists along with linked list
    /**
     * Class Node creates a node that
     * contains a shape and a pointer to next node
     * Class Node is a nested class it exists within the linked list
     */  
    public static class Node {

        private Shape data;
        private Node next;
        
        /**
         * Empty Constructor
         */
        public Node(){
        	this.data=null;
        	this.next=null;
        }
        
        /**
         * Class Constructor receives shape to store in node
         * @param d shape to store in Node
         */
        public Node(Shape d){
        	this.data=d;
        	this.next=null;
        }
        
        /**
         * Getter for node data
         * @return shape currently in node
         */
        public Shape getData(){
			return data;
        }
        
        /**
         * getter for next node
         * @return node that follows current node
         */
        public Node getNext(){
        	return next;
        }
        
        /**
         * Setter for node data
         * @param d shape to store in node
         */
        public void setData(Shape d){
        	this.data=d;
        }
        
        /**
         * Setter for next node
         * @param n next node
         */
        public void setNext(Node n){
        	this.next=n;
        }
        
       /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString(){
        	return "NODE="+data+"\n        next -> "+next+" ";
        }
        
        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object o){
    		if(this == o){
    			return true;
    		}
    		if(!(o instanceof Object)){
    			return false;
    		}
    		
    		Node node = (Node) o;
    		if(!data.equals(node.data)){
    			return false;
    		}
    		if(!next.equals(node.next)){
    			return false;
    		}		
        	return true;
        }
        
        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode(){
        	int result=0;
        	result = (data != null ? data.hashCode() : 0);
        	result = 31 * result + (next != null ? next.hashCode() : 0);
        	return result;
        }
    }
}
