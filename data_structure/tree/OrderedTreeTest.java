import java.util.LinkedList;

public class OrderedTreeTest {

	public static void main(String[] args) {
		// OrderedTree treeA, treeB, treeC, treeD, treeF, treeG;

		/* 각 리프 노드 생성 */
		OrderedTree treeH = new OrderedTree("H");
		OrderedTree treeE = new OrderedTree("E");
		OrderedTree treeI = new OrderedTree("I");
		OrderedTree treeJ = new OrderedTree("J");
		OrderedTree treeK = new OrderedTree("K");

		LinkedList<Object> subtreesOfD = new LinkedList<Object>();
		subtreesOfD.add(treeH);
		OrderedTree treeD = new OrderedTree("D", subtreesOfD);

		LinkedList<Object> subtreesOfB = new LinkedList<Object>();
		subtreesOfB.add(treeD);
		subtreesOfB.add(treeE);
		OrderedTree treeB = new OrderedTree("B", subtreesOfB);

		LinkedList<Object> subtreesOfF = new LinkedList<Object>();
		subtreesOfF.add(treeI);
		OrderedTree treeF = new OrderedTree("F", subtreesOfF);

		LinkedList<Object> subtreesOfG = new LinkedList<Object>();
		subtreesOfG.add(treeJ);
		subtreesOfG.add(treeK);
		OrderedTree treeG = new OrderedTree("G", subtreesOfG);

		LinkedList<Object> subtreesOfC = new LinkedList<Object>();
		subtreesOfC.add(treeF);
		subtreesOfC.add(treeG);
		OrderedTree treeC = new OrderedTree("C", subtreesOfC);

		LinkedList<Object> subtreesOfA = new LinkedList<Object>();
		subtreesOfA.add(treeB);
		subtreesOfA.add(treeC);
		OrderedTree treeA = new OrderedTree("A", subtreesOfA);

		/* 후위 순회 메소드 호출 */
		treeA.postorder();
	}

}
