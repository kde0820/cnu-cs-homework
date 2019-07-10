public class SlinkedQueue implements Queue {
	private Node front; // 첫번째 노드를 가리킴(삽입하는 위치)
	private Node rear; // 마지막 노드를 가리킴(삭제하는 위치)
	private int size; // 큐에 저장된 원소의 개수

	@Override
	/* 큐에 원소를 삽입하는 메소드 */
	public void add(Object object) {
		if (front == null) { // 큐가 비어있을 경우
			front = new Node(object, front);
			rear = front;
			size++;
		} else {// 큐가 비어있지 않을 경우
			rear = rear.next = new Node(object, rear.next);
			size++;
		}
		return;
	}

	@Override
	/* 큐의 첫번째 원소를 확인 */
	public Object first() {
		if (size == 0)
			throw new IllegalStateException("the queue is empty");
		return front.object;
	}

	@Override
	/* 큐의 첫번째 원소를 삭제하고, 해당 원소 반환 */
	public Object remove() {
		if (front == null)// 큐가 비어있을 경우
			System.out.println("Queue is Empty");
		else { // 큐가 비어있지 않을 경우
			Node p = front;
			front = front.next;
			size--;
			return p.object;
		}
		return null;
	}

	@Override
	/* 큐에 저장된 원소의 개수를 반환 */
	public int size() {
		return size;
	}

	@Override
	/* 큐 내부의 원소들을 출력 */
	public void print() {
		for (Node p = front; p != null; p = p.next) {
			System.out.print(p.object + "<--");
		}
		System.out.println("null");
	}

	@Override
	/* 구현 X */
	public void resize() {

	}

	private static class Node {
		Object object;
		Node next;

		Node(Object object) {
			this.object = object;
		}

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}
}
