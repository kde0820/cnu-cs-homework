public class BinaryTree {
	private Object root;
	private BinaryTree left, right;

	/* 생성자1: root값만 가지는 트리 생성 */
	public BinaryTree(Object root) {
		this.root = root;
	}

	/* 생성자2: root, left, right를 갖는 트리 생성 */
	public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
		this.root = root;
		this.left = left;
		this.right = right;
	}

	/* that 객체 현재의 객체가 참조하도록 작성 */
	/* this.root => that.root ... */
	public BinaryTree(BinaryTree that) {
		this.root = that.root;
		this.left = that.left;
		this.right = that.right;
	}

	/* root값을 반환하도록 getter 작성 */
	public Object getRoot() {
		return this.root;
	}

	/* 후위 순회 메소드 작성 */
	// 후위 순회
	// 각 서브트리를 순서대로 후위 순회한다.
	// 루트를 방문한다.(출력)
	public void postorder(BinaryTree tree) {
		if (tree != null) { // 트리가 비어있지 않으면
			postorder(tree.left); // 트리의 왼쪽 자손을 매개변수로 postorder 호출
			postorder(tree.right); // 트리의 오른쪽 자손을 매개변수로 postorder 호출
			System.out.print(tree.root + " "); // 트리의 root를 출력함 tree.getRoot()를 사용해도 동일한 결과 출력
		}
	}

	/* 현재 구성된 트리 구조를 출력하는 메소드 */
	public String toString() {
		StringBuffer buf = new StringBuffer("[");
		if (left != null)
			buf.append(left + ",");
		buf.append(root);
		if (right != null)
			buf.append("," + right);
		return buf + "]";
	}
}
