package week1;

public class Day4FindSumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] k = {65, 45, 25, 65, 84, 74, 96, 74, 15, 36};
		
		int sum=0; 
		double average=0;
		
		for(int i=0; i<k.length;i++) {
			
			sum = sum+k[i];
		}
		
		System.out.println("Sum of elements::"+sum);
		average = sum/k.length;
		System.out.println("Average of Elemnets"+average);

	}

}
