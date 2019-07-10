public class ArrayQueue implements Queue {
	Object queue[];// Queue에 사용할 배열
	int size = 0;// queue에 저장된 원소의 개수
	int queueSize;// queue의 초기 크기

	public ArrayQueue(int queueSize) {// 생성자
		// queue 초기화
		this.queue = new Object[queueSize];
		this.queueSize = queueSize;
	}

	@Override
	/* 큐에 원소를 삽입하는 메소드 */
	public void add(Object object) {
		if (size == queueSize) { // queue가 가득 차 있을 경우
			System.out.println("Queue is Full! RESIZE");
			resize(); // resize()를 호출하여 queue 배열의 크기를 2배 늘여줌.
			queue[size++] = object;
		} else
			queue[size++] = object;
	}

	@Override
	/* 큐의 첫번째 원소를 확인 */
	public Object first() {
		if (size == 0) // 큐가 비어있는 경우
			throw new IllegalStateException("the queue is empty");
		else // 큐가 비어있지 않은 경우
			return queue[0]; // 첫번째 원소를 반환
	}

	@Override
	/* 큐의 첫번째 원소를 삭제하고, 해당 원소 반환 */
	public Object remove() {
		if (size == 0) { // 큐가 비어있는 경우
			System.out.println("Queue is Empty");
		} else { // 큐가 비어있지 않은 경우
			Object front = queue[0]; // 큐의 첫번째 원소를 반환해주기 위해 front에 저장함
			for (int i = 0; i < size; i++) {
				queue[i] = queue[i + 1];
				queue[i + 1] = null;
			} // 배열을 하나씩 앞으로 당겨줌
			size--;
			return front;
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
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == null)
				break;
			System.out.print(queue[i]);
			if (i == size - 1)
				break;
			System.out.print("<--");
		}
		System.out.println();
	}

	@Override
	/* 배열의 크기를 늘여줌 */
	public void resize() {
		Object[] temp = queue;
		queue = new Object[2 * temp.length];
		System.arraycopy(temp, 0, queue, 0, temp.length);
	}
}
