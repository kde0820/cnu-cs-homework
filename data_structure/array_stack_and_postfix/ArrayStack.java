public class ArrayStack {
	private Object[] a; // 스택의 원소를 저장하기 위한 배열
	private int size; // 스택에 있는 원소의 수

	public ArrayStack(int capacity) {
		a = new Object[capacity];
	}

	/* 스택이 공백이면 true를 리턴함 */
	public boolean isEmpty() {
		return (size == 0);
	}

	/* 스택이 공백이 아니면 톱의 원소를 리턴함 */
	public Object peek() {
		if (size == 0)
			throw new IllegalStateException("Stack is empty");
		return a[size - 1];
	}

	/* 스택이 공백이 아니면 톱의 원소를 삭제해서 리턴함 */
	public Object pop() {
		if (size == 0)
			throw new IllegalStateException("Stack is empty");
		Object object = a[--size];
		a[size] = null;
		return object;
	}

	/* 주어진 원소를 스택의 톱에 추가함 */
	public void push(Object object) {
		if (size == a.length)
			resize();
		a[size++] = object;
	}

	/* 스택에 있는 원소의 수를 리턴함 */
	public int size() {
		return size;
	}

	/* 배열이 꽉 찼을때 배열의 크기를 두 배 만큼 늘여줌 */
	public void resize() {
		Object[] aa = a;
		a = new Object[2 * aa.length];
		System.arraycopy(aa, 0, a, 0, size);
	}
}
