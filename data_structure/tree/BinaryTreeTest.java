public class BinaryTreeTest {

	public static void main(String[] args) {
		/* 각 리프노드 생성 */
		BinaryTree treeH = new BinaryTree("H");
		BinaryTree treeE = new BinaryTree("E");
		BinaryTree treeI = new BinaryTree("I");
		BinaryTree treeJ = new BinaryTree("J");
		BinaryTree treeK = new BinaryTree("K");
		/* 노드의 깊이가 2인 노드들 생성 */
		BinaryTree treeD = new BinaryTree("D", null, treeH);
		BinaryTree treeF = new BinaryTree("F", treeI, null);
		BinaryTree treeG = new BinaryTree("G", treeJ, treeK);
		/* 노드의 깊이가 1인 노드들 생성 */
		BinaryTree treeB = new BinaryTree("B", treeD, treeE);
		BinaryTree treeC = new BinaryTree("C", treeF, treeG);
		BinaryTree treeA = new BinaryTree("A", treeB, treeC);

		System.out.println("Tree 출력: " + treeA.toString()); // 생성된 트리 출력
		System.out.print("Postorder: ");

		/* 후위 순회 메소드 호출 */
		treeA.postorder(treeA);
	}

}
