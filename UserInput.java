import java.util.Scanner;
import java.io.*;

public class UserInput{
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double[] numbers = new double[2];
	public double[] inputTwoNumbers(){
		System.out.println("Enter first number: ");
		numbers[0] = scan.nextDouble();
		System.out.println("Enter second number: ");
		numbers[1] = scan.nextDouble();
		return numbers;
	}
	
	public double[] inputMultipleNumbers() throws IOException{
		System.out.println("Enter Size of Array: ");
		int size = scan.nextInt();

		double array[] = new double[size];
		String str = "";
		try {
			str = br.readLine();
		} catch(IOException e){
			System.out.println();
		}
		String[] array_numbers = str.trim().split("\\s+");

		for(int i=0;i<size;i++) {
			array[i] = Double.parseDouble(array_numbers[i]);
		}
		return array;
	}
}