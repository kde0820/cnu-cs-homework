public class BST {
	private Comparable key;
	private BST left, right;
	private Object root; // root는 Object타입으로 선언해줌

	private int leftSubtreeHeight;
	private int rightSubtreeHeight;

	public BST(Comparable key) {
		this.key = key;
		this.leftSubtreeHeight = 0;
		this.rightSubtreeHeight = 0;
	}

	/* 삽입 메소드 */
	public void insert(Object key) {
		if (root == null) { // 트리가 비어있을때
			root = key;
			this.key = (Comparable) key;
			// 주어진 key값을 가지는 단독트리 생성
		} else {
			if (this.key.compareTo(key) > 0) { // 현재의 key값(루트의 key값)이 삽입될 key값보다 크면 -> 왼쪽 서브트리에 삽입되어야함
				if (left == null) { // left 자식이 없으면
					left = new BST((Comparable) key); // 주어진 key값을 가지는 노드를 생성하여 left에 삽입
				}
				left.insert(key); // 순환: left에서 insert 호출
			} else { // 오른쪽 서브트리에 삽입되는 경우
				if (right == null) { // right 자식이 없으면
					right = new BST((Comparable) key); // 주어진 key값을 가지는 노드를 생성하여 right에 삽입
				}
				right.insert(key); // 순환: right에서 insert 호출
			}
		}
	}

	/* 트리의 높이를 리턴하는 메소드 */
	public Object height(BST bst) {
		if (bst != null) { // bst가 비어있지 않으면
			if (left != null) { // 왼쪽이 비어있지 않으면
				leftSubtreeHeight = (int) left.height(left); // left에서 재귀적으로 height를 호출하여 리턴된 값을 leftSubtreeHeight에 저장
			}
			if (right != null) {// 오른쪽이 비어있지 않으면
				rightSubtreeHeight = (int) right.height(right); // right에서 재귀적으로 height를 호출하여 리턴된 값을 rightSubtreeHeight에
																// 저장
			}
		}
		if (left == null && right == null) { // 리프노드인 경우: 높이가 0임
			return (leftSubtreeHeight > rightSubtreeHeight) ? leftSubtreeHeight : rightSubtreeHeight;
		}
		return (leftSubtreeHeight > rightSubtreeHeight) ? leftSubtreeHeight + 1 : rightSubtreeHeight + 1; // 왼쪽 서브트리의
																											// 높이와 오른쪽
																											// 서브트리의 높이를
																											// 비교하여 더 큰
																											// 값에 1을 더한
																											// 값을 리턴함
	}

	/* 트리를 중위순회하는 메소드 */
	public void inorder(BST bst) {
		if (bst != null) { // bst가 비어있지 않으면
			inorder(bst.left); // 순환: left를 중위순회함
			System.out.print(bst.root + " "); // root값 출력
			inorder(bst.right); // 순환: right를 중위순회함
		}
	}
}
