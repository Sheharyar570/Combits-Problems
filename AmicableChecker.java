import java.util.ArrayList;

public class AmicableChecker {
		private int number1; // to store 1st number
		private int number2; // to store 2nd number
		private int sumOfDivisorArray1; // storing sum of divisors of number1
		private int sumOfDivisorArray2; // storing sum of divisors of number2
		private ArrayList<Integer> number1Divisors = new ArrayList<Integer>();	// store the divisors of number1
		private ArrayList<Integer> number2Divisors = new ArrayList<Integer>();	// store the divisors of number2
		
		// Constructor 
		public AmicableChecker(int number1, int number2){
			if(number1 < 20000 && number2 < 20000){
			this.number1 = number1;
			this.number2 = number2;
			}
			else {
				System.out.println("Enter number again. ");
			this.number1 = 20000;
			this.number2 = 20000;
			}
		}
		
		// method to store number divisor
		public void storingDivisor(ArrayList<Integer> array, int number){
			for(int i = 1; i <= (number/2); i++){
				if(number%i == 0){
					array.add(i);
				}
			}
		}
		
		// sum the divisor of number1
		public void sumOfDivisor1(){
			for(int i: number2Divisors){
				sumOfDivisorArray2 += i;
			}
		}
		
		// sum the divisor of number2
		public void sumOfDivisor2(){
			for(int i: number1Divisors){
				sumOfDivisorArray1 += i;
			}
		}
		
		// Checking if numbers are AMICABLE: Amicable problem solution
		public void AmicableCheckerMethod(){
			if(sumOfDivisorArray1 == number2){
				if(sumOfDivisorArray2 == number1){
					System.out.println("Numbers are amicable: ");
				}
			}
				else if(sumOfDivisorArray2 == number1){
					if(sumOfDivisorArray1 == number2){
						System.out.println("Numbers are amicable: ");
					}
			}
				else 
					System.out.print("Numbers are not amicable. ");
		}
		
		// Initialize the program
		public void initialize(){
			if(number1 < 20000 && number2 < 20000){
			storingDivisor(number1Divisors, number1);
			storingDivisor(number2Divisors, number2);
			sumOfDivisor1();
			sumOfDivisor2();
			AmicableCheckerMethod();
			}
			else if( number1 >= 20000 && number2 >= 20000) {
				System.out.println("Try Again!!! ");
			}
		}
}
