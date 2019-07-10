public class LinkedList {
	Node start; //LinkedList 노드로 사용되는 변수
	
	class Node{
		private int data; //노드에 저장되는 정수
		private Node next; //next 노드
			
		public Node(int data){
			this.data = data;
		}
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	/*LinkedList에 정수를 오름차순으로 삽입하는 메소드*/
	public void insert(int x){
		if (start == null || start.data > x){
			start = new Node(x,start);
			return;
		}
		Node p = start;
		while(p.next != null){
			if(p.next.data > x) break;
			p = p.next;
		}
		p.next = new Node(x,p.next);
		return;		
	}
	/*LinkedList에 저장된 정수를 출력하는 메소드*/
	public void print(){
		for(Node p = start; p != null; p = p.next){
			System.out.print(p.data + "-->");
		}
		System.out.println("null");
	}
	/*원하는 정수를 LinkedList에서 삭제하는 메소드*/
	public void delete(int x){
		if(start == null || start.data>x) return; //x가 리스트에 없을때
		if(start.data == x){ //x가 리스트의 첫번째 원소일때
			start = start.next; //해당하는 data를 지움
		}
		for(Node p = start; p.next != null; p = p.next){
			if(p.next.data > x) break; //x가 리스트에 없음
			if(p.next.data == x){
				p.next = p.next.next; //해당하는 data를 지움
				break;
			}
		}
	}
	/*LinkedList의 마지막 노드에 다른 노드를 연결하는 메소드*/
	public void merge(LinkedList arg0){
		Node p = start;
		
		while(p.next != null){
			p = p.next;
		} //p가 LinkedList의 마지막 노드를 가리킬때까지 나아감.
		
		p.next = arg0.start; //LinkedList의 마지막 노드에 다른 노드를 연결
		
	}		
	/*LinkedList의 순서를 뒤집는 메소드*/
	public void reverse(){
		Node p = start;
		Node q = null;
		Node r = null;
		
		q = p;
		p = p.next;
		q.next = null;
		
		while(p != null){						
			r = p.next;
			p.next = q;
			q = p;
			p = r;							
		}
		start = q;
	}
}
