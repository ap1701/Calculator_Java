import java.util.Scanner;
public class Main {
	static double[] numbers;
	static double[] array;
	static double[] result;
	public static void main(String[] args) throws Exception{
		int m = 1;
		while(m==1) {
			UserInput input = new UserInput();
			numbers = input.inputTwoNumbers();
			Calculator calc = new Calculator();
			System.out.println("First number is " + numbers[0]);
			System.out.println("Second number is " + numbers[1]);
			System.out.println("\nMENU\n====");
			System.out.println("Type + for addition");
			System.out.println("Type - for subtraction");
			System.out.println("Type * for multiplication");
			System.out.println("Type / for division");
			System.out.println("Type @ for Array Operations");
			Scanner sc = new Scanner(System.in);
			char operator = sc.next().charAt(0);
			switch(operator){
				case '+':
					result = calc.addNum(numbers);
					System.out.println("Sum is " + result[0]);
					break;
				case '-':
					result = calc.subtractNum(numbers);
					System.out.println("Difference is " + result[0]);
					break;
				case '*':
					result = calc.multiplyNum(numbers);
					System.out.println("Product is " + result[0]);
					break;
				case '/':
					result = calc.divideNum(numbers);
					System.out.println("Fraction is " + result[0]);
					break;
				case '@':
					array = input.inputMultipleNumbers();
					System.out.println("Array Operations:");
					System.out.println("Type + for addition");
					System.out.println("Type v for variance");
					System.out.println("Type s for standard deviation");
					char newop = sc.next().charAt(0);
					switch(newop) {
						case '+':
							result = calc.addArr(array);
							System.out.println("Addidtion of the array is: " + result[0]);
							break;
						case 'v':
							result = calc.varArr(array);
							System.out.println("Variance of the array is: " + result[0]);
							break;
						case 's':
							result = calc.stdArr(array);
							System.out.println("Standard Deviation of the array is: " + result[0]);
							break;
						default:
							System.out.println("Not a valid array operation");
					}
					break;
				default:
					System.out.println("wrong input");
			}
		System.out.println("Do you want to continue?(1/0)");
		m = sc.nextInt();
		}
	}
}