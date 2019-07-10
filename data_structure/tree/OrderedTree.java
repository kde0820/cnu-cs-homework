import java.util.*;

public class OrderedTree {
	private Object root;
	private List<Object> subtrees;
	private int size;

	public OrderedTree() {

	}

	/* root노드만 가지는 트리 생성 */
	public OrderedTree(Object root) {
		this.root = root;
		subtrees = new LinkedList<Object>();
		size = 1;
	}

	/* root노드와 subtree를 가지는 트리 생성 */
	public OrderedTree(Object root, List<Object> trees) {
		this(root);
		for (Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof OrderedTree) {
				OrderedTree tree = (OrderedTree) object;
				subtrees.add(tree);
				size += tree.size();
			}
		}
	}

	/* 후위 순회 메소드 */
	public void postorder() {
		OrderedTree tree;
		Iterator it = this.subtrees.iterator();
		while (it.hasNext()) { // 자식들이 있는 한 루프를 돈다.
			tree = (OrderedTree) it.next();
			tree.postorder(); // postorder() 호출
		}
		System.out.print(this.root + " ");
	}

	public int size() {
		return size;
	}
}
