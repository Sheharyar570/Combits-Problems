import java.util.ArrayList;


public class GoldBachsProblem {
										/* 	Data Members */
	
	private ArrayList<Integer> primes = new ArrayList<Integer>(); // using ArrayList to store prime numbers
	private ArrayList<Integer> pairs = new ArrayList<Integer>(); // using ArrayList to store the conjecture 
	private int num;
	
						/* Constructor */
		public GoldBachsProblem(int num){
		this.num = num;
		}
		public void initialize(){
			primeNo();
			findingPairs();
			display();
		}
						/* Method to find all prime number till the given number */
	public void primeNo(){
		for(int i = 2; i < num; i++){
			int counter = 0; // Variable to check weather the given number is prime number
			for(int j = 2; j <= i/2; j++){
				if((i%j)==0){
				counter++;
					}
				}
			if(counter == 0){
				primes.add(i);
					}
				}
			}
				
		 					/* Method to find prime numbers */
							// Main Logic of the Whole program
		public void findingPairs(){
			for(int i = 0; i < primes.size() ; i++){
				for(int j = 0; j < primes.size(); j++){
					if(primes.get(i) + primes.get(j) == num ){
						pairs.add(primes.get(i));
						pairs.add(primes.get(j));
					}		
				}		
			}
		}
							/* Method to display GoldBach's Conjecture */
		public void display(){
			int count = 0;
			System.out.printf("\nGoldBachs Conjecture for number %d", this.num);
			System.out.println();
			for(int i: pairs){
			System.out.print( i + (count%2==0 ? "," : "; ") );	
			count++;
		}
			
	}
}

