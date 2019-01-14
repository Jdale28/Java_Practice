
public class function {
	public static void main(String[] args) {
		int num1 = 10, num2 = 35;
		// Function call
		int ans = sum(num1, num2);
		System.out.println("The sum of the 2 numbers is " + ans);
	}
	
	// This is my function for sum
	public static int sum(int a, int b) {
		int sol;
		sol = a + b;
		return sol;
	}
}
