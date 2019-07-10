import java.util.Random;

public class TestLinkedList {

	public static void main(String[] args) {
		Random number = new Random();
		LinkedList LinkedList1 = new LinkedList();
		LinkedList LinkedList2 = new LinkedList();

		int i;
		System.out.println("***** Insert LinkedList *****");
		for (i = 0; i < 10; i++) {
			int num = number.nextInt(100);
			LinkedList1.insert(num);
		}
		LinkedList1.print();

		System.out.println("***** Reverse LinkedList *****");
		LinkedList1.reverse();
		LinkedList1.print();

		System.out.println("***** Insert LinkedList *****");
		for (i = 0; i < 10; i++) {
			int num = number.nextInt(100);
			LinkedList2.insert(num);
		}
		LinkedList2.print();

		LinkedList1.merge(LinkedList2);
		System.out.println("***** Merge LinkedList *****");
		LinkedList1.print();
	}
}
