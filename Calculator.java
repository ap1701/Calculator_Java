import java.lang.Math;

public class Calculator{
	static double[] result = new double[1];
	public double[] addNum(double[] numbers){
		result[0] = numbers[0] + numbers[1];
		return result;
	}
	public double[] subtractNum(double[] numbers){
		result[0] = numbers[0] - numbers[1];
		return result;
	}
	public double[] multiplyNum(double[] numbers){
		result[0] = numbers[0] * numbers[1];
		return result;
	}
	public double[] divideNum(double[] numbers){
		result[0] = numbers[0] / numbers[1];
		return result;
	}
	public double[] addArr(double[] numbers){
		for(int i=0;i<numbers.length;i++){
			result[0] += numbers[i];
		}
		return result;
	}
	public double[] varArr(double[] numbers){
		double mean = addArr(numbers)[0]/numbers.length;
		double var = 0;
		for(int i=0;i<numbers.length;i++){
			var += Math.pow(numbers[i]-mean,2);
		}
		result[0] = var/numbers.length;
		return result;
	}
	public double[] stdArr(double[] numbers){
		result[0] = Math.pow(varArr(numbers)[0],0.5);
		return result;
	}
}