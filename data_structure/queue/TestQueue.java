public class TestQueue {

	public static void main(String[] args) {
		TestQueue mTestQueue = new TestQueue();

		mTestQueue.testArrayQueue();
		mTestQueue.testSlinkedQueue();

	}

	public void testArrayQueue() {
		Queue mArrayQueue = new ArrayQueue(4);
		System.out.println("********** Test ArrayQueue **********");
		mArrayQueue.add("DE");
		System.out.print("ADD     DE | ");
		mArrayQueue.print();
		mArrayQueue.add("PA");
		System.out.print("ADD     PA | ");
		mArrayQueue.print();
		mArrayQueue.add("NJ");
		System.out.print("ADD     NJ | ");
		mArrayQueue.print();
		mArrayQueue.remove();
		System.out.print("REMOVE  DE | ");
		mArrayQueue.print();
		mArrayQueue.remove();
		System.out.print("REMOVE  PA | ");
		mArrayQueue.print();
		mArrayQueue.remove();
		System.out.print("REMOVE  NJ | ");
		mArrayQueue.print();
		mArrayQueue.remove();
		mArrayQueue.add("GA");
		System.out.print("ADD     GA | ");
		mArrayQueue.print();
		mArrayQueue.add("CT");
		System.out.print("ADD     CT | ");
		mArrayQueue.print();
		mArrayQueue.add("MA");
		System.out.print("ADD     MA | ");
		mArrayQueue.print();
		mArrayQueue.add("MD");
		System.out.print("ADD     MD | ");
		mArrayQueue.print();
		mArrayQueue.add("AB");
		System.out.print("ADD     AB | ");
		mArrayQueue.print();
		mArrayQueue.remove();
		System.out.print("REMOVE  GA | ");
		mArrayQueue.print();
		System.out.println();
	}

	public void testSlinkedQueue() {
		Queue mSlinkedQueue = new SlinkedQueue();
		System.out.println("********** Test SlinkedQueue **********");
		mSlinkedQueue.add("DE");
		System.out.print("ADD     DE | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("PA");
		System.out.print("ADD     PA | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("NJ");
		System.out.print("ADD     NJ | ");
		mSlinkedQueue.print();
		mSlinkedQueue.remove();
		System.out.print("REMOVE  DE | ");
		mSlinkedQueue.print();
		mSlinkedQueue.remove();
		System.out.print("REMOVE  PA | ");
		mSlinkedQueue.print();
		mSlinkedQueue.remove();
		System.out.print("REMOVE  NJ | ");
		mSlinkedQueue.print();
		mSlinkedQueue.remove();
		mSlinkedQueue.add("GA");
		System.out.print("ADD     GA | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("CT");
		System.out.print("ADD     CT | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("MA");
		System.out.print("ADD     MA | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("MD");
		System.out.print("ADD     MD | ");
		mSlinkedQueue.print();
		mSlinkedQueue.add("AB");
		System.out.print("ADD     AB | ");
		mSlinkedQueue.print();
		mSlinkedQueue.remove();
		System.out.print("REMOVE  GA | ");
		mSlinkedQueue.print();

	}

}
