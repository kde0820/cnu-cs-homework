public class Transform {

	public String[] infixToPostfix(String[] args) {
		ArrayStack stack = new ArrayStack(5); // ArrayStack 객체 stack 생성
		String[] postfix = new String[20]; // 중위식을 후위식으로 변환한 결과를 저장할 String 배열 생성
		int index = 0; // 후위식 배열의 index를 나타내는 변수 선언

		for (int i = 0; i < args.length; i++) { // 중위식이 끝날때까지 반복함.
			/* 연산자일 때 */
			if ("ASMD".indexOf(args[i]) >= 0) {
				if (stack.isEmpty()) { // 스택이 비어있으면
					stack.push(args[i]); // 스택에 쌓음
				} else {
					/* 스택에 있는 연산자 중 들어올 연산자보다 우선순위가 높거나 같은 것을 모두 pop하고 들어올 연산자를 스택에 push함 */
					while (true) {
						if (stack.isEmpty()) { // 스택에 있는 연산자를 모두 pop해버리면 스택이 비어있게 됨
							stack.push(args[i]); // 스택에 쌓음
							break;
						} else {
							if (precedence((String) stack.peek()) < precedence(args[i])) { // 스택의 톱에 있는 연산자의 우선순위가 들어올
																							// 연산자의 우선순위보다 작으면
								stack.push(args[i]); // 스택에 쌓음
								break;
							} else // 스택의 톱에 있는 연산자의 우선순위가 들어올 연산자의 우선순위보다 같거나 크면
								postfix[index++] = (String) stack.pop(); // 스택의 톱에 있는 연산자를 pop해서 후위식 배열에 넣어줌.
						}
					}
				}
			}
			/* 괄호일때 */
			else if (args[i].equals("(")) { // 왼쪽 괄호이면 스택에 쌓음
				stack.push(args[i]);
			} else if (args[i].equals(")")) { // 오른쪽 괄호이면
				while (!stack.peek().equals("(")) {
					postfix[index++] = (String) stack.pop();
				} // 왼쪽 괄호를 만날때 까지 pop해서 후위식 배열에 넣어줌
				if (stack.peek().equals("(")) {
					stack.pop(); // 왼쪽 괄호를 만나면 왼쪽 괄호를 pop해서 없애버림.
				}
			}
			/* 피연산자일 때 */
			else {
				postfix[index++] = args[i]; // 후위식 배열에 넣어줌
			}
			/* eos일 때 */
			if (i == args.length - 1) {
				while (!stack.isEmpty()) {
					postfix[index++] = (String) stack.pop(); // 스택에 남아있는 연산자들을 모두 pop해서 후위식 배열에 넣어줌.
				}
			}
		}

		System.out.print("변경된 후위식 : ");
		/* 변경된 후위식을 출력해줌 */
		for (int i = 0; i < postfix.length; i++) {
			if (postfix[i] == null)
				break; // postfix에 저장된 값이 없으면 출력하지 않음
			System.out.print(postfix[i] + " ");
		}
		System.out.println("");

		return postfix; // 변환한 후위식배열을 반환함
	}

	/* 연산자의 우선 순위를 반환하는 함수 작성 */
	public int precedence(String token) {
		// 괄호는 연산자로 취급하지 않고 infixToPostfix에서 따로 처리해줌
		if (token.equals("A") || token.equals("S")) // token이 +,-인 경우
			return 2;
		else if (token.equals("M") || token.equals("D")) // token이 *,/인 경우
			return 4;
		else
			return 0;
	}
}
