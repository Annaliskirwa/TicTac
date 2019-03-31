import java.util.Scanner;

public class MbaireCalculator {

	public MbaireCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		System.out.println("Enter two numbers:  ");
		// TODO Auto-generated method stub
		int first = num.nextInt() ;
		
		int second = num.nextInt() ;
		
	System.out.println("Enter an operatoration (+, -, *, /):  ");
	char operator = num.next(). charAt(0);
	
	double result = 0;
	
	switch (operator)
	{
	case '+':
		result = first + second;
		break;
		
	case '-':
		result = first - second;
		break;
		
	case '*':
		result = first * second;
		break;
			
	case '/':
		result = first / second;
		break;
		
		default:
			System.out.println(" Invalid Operator,, Choose another");
	}
	System.out.printf("%d %c %d", first , operator , second);
	System.out.printf("The result is = %f", result);
	
	}

}
