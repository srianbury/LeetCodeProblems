
public class NumberSum {
	public static void main(String ars[]){
		System.out.println(numberSum(0));
	}
	
	public static int numberSum(int number){
		int answer = 0;
		while(number>0){
			answer += number%10;
			number/=10;
			System.out.println("Answer: " + answer);
			System.out.println("Number: " + number);
		}
		return answer;
	}
}
