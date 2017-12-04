import java.util.Arrays;

public class Stack {
	private char[] stack;
	private int stackSize; //size of the stack array
	private int topOfStack = -1; //index of the top of the stack
	Stack(int size){
		stackSize = size;
		stack = new char[size];
		Arrays.fill(stack, '0');
	}
	
	public void push(char input){
		if(topOfStack + 1 < stackSize){
			topOfStack++;
			stack[topOfStack] = input;
			System.out.println("Pushing " + input);
		}else{
			System.out.println("The stack is full.");
		}
	}
	
	public void pop(){
		if(topOfStack>=0){
			System.out.println(stack[topOfStack] + " was removed.");
			stack[topOfStack] = '0'; //for display purposes only because output skips -1
			topOfStack--;
		}else{
			System.out.println("The stack is empty.");
		}
	}
	
	public char peek(){
		return stack[topOfStack];
		//System.out.println(stack[topOfStack] + " is at the top of the stack.");
	}
	
	public void displayTheStack(){
		System.out.println("The stack:");
		for(int i=stackSize-1; i>-1; i--){
			if(stack[i]!=-1){
				System.out.println(stack[i]);
			}
		}
	}
	
	public boolean isEmpty(){
		for(int index=0; index<stackSize; index++){
			if(stack[index]!='0'){
				return false;
			}
		}
		return true;
	}
}
