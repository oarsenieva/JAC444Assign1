/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */
 
 /**
 * Main class, contains main method
 *
 */
public class Main {
	/**
	 * This is the main method which creates Shapes and adds them to Linked List
	 * @param args unused
	 */
    public static void main(String[] args) {

        int[] values = {2,1,3,5,3,5,7,1,4,5,1,2,8,9};
        ShapeLinkedList sll = new ShapeLinkedList();

        Circle c1 = new Circle(values[0]);
        Circle c2 = new Circle(values[1]);

        Square sq1 = new Square(values[2]);
        Square sq2 = new Square(values[3]);

        Triangle t1 = new Triangle(values[4],values[5],values[6]);
        Triangle t2 = new Triangle(values[7],values[8],values[9]);

        Rectangle r1 = new Rectangle(values[10],values[11]);
        Rectangle r2 = new Rectangle(values[12],values[13]);


        sll.insertAtBeginning(r1);
        sll.insertAtBeginning(r2);
        sll.insertAtBeginning(c1);
        sll.insertAtBeginning(c2);
        sll.insertAtEnd(sq1);
        sll.insertAtEnd(sq2);
        sll.insertAtEnd(t1);
        sll.insertAtEnd(t2);

        //printing out list
        System.out.println("\n---Task 1---\nPrinting out populated Linked List...");
        System.out.println(sll.toString());


        //task 2 delete list tail and reprint
        sll.deleteAtIndex(sll.length()-1);
        System.out.println("\n\n---Task 2 : remove tail---\nPrinting altered Linked List...");
        System.out.println(sll.toString());
        
    
        //task 3 delete shape sq2 print list
        sll.deleteData(sq2);
        System.out.println("\n\n---Task 3 : remove sq2---\nPrinting Linked List without sq2");
        System.out.println(sll.toString());

    }
}
