
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing {}[]{{");
		System.out.println(isValid("{}[]{{"));
		
		System.out.println("\nTesting {}[]{}[()]{[()]}");
		System.out.println(isValid("{}[]{}[()]{[()]}"));
	}
	
	private static boolean isValid(String phrase){
		
		Stack parentStack = new Stack(phrase.length());
		for(int index=0; index<phrase.length(); index++){
			if(phrase.charAt(index)=='(' || phrase.charAt(index) == '[' || phrase.charAt(index) == '{'){
				parentStack.push(phrase.charAt(index));
			}else if(!parentStack.isEmpty() && ((parentStack.peek()=='(' && phrase.charAt(index) == ')') 
					|| (parentStack.peek()=='[' && phrase.charAt(index) == ']') 
					|| (parentStack.peek()=='{' && phrase.charAt(index) == '}'))){
				
				parentStack.pop();
			}else{
				parentStack.push(phrase.charAt(index));
			}
		}
		return parentStack.isEmpty();
	}

}
