import java.util.ArrayList;

public class JosephusProblem {
							/*		Variable Declaration   		*/
	
	private int numberOfPeople; // number of people in the game
	private int peopleToBeSkipped; // number of people to be skipped
	private String direction; // the direction in which we start counting
	private int startingPoint; // from where we start counting
	private final String cDirection = "clockwise";		// to use a String variable instead of string literal in program
	private ArrayList<Integer> people = new ArrayList<Integer>(); // list to store persons
	private boolean decision = true; // check if the game ends
	private int skipped = 0;
	
	
								/* Constructor with parameters */
		public JosephusProblem(int numberOfPeople, int peopleToBeSkipped, int startingPoint, String direction){
			this.numberOfPeople = numberOfPeople;
			this.peopleToBeSkipped = peopleToBeSkipped;
			this.direction = direction;
			this.startingPoint = startingPoint;
		}
		
		/* default constructor */
		public JosephusProblem(){
			this.numberOfPeople = 10;
			this.peopleToBeSkipped = 3;
			this.direction = cDirection;
			this.startingPoint = 1;
		}
		
				/* Filling the array list */
		public void fillingArray(){
			for(int i = 1; i <= numberOfPeople; i++){
				people.add(i);
			}
		}
			/* If the game starts in CLOCK-WISE Direction */
		public void clockWiseDirection(){
			for (int j = 1; decision ; j++ ){
				for(int i = (j==1 ? (startingPoint-1) : 0); i < people.size(); i++){
						if(skipped <= peopleToBeSkipped){
							if(skipped == peopleToBeSkipped){
								skipped++;
							}
							else{
							System.out.print( people.get(i) + " ");
							skipped++;
							}
						}
						if(skipped > peopleToBeSkipped){
							System.out.print( "\n" + people.get(i) + " is eliminated. \n" );
							people.remove(i);
							i--;
							skipped = 0;
							}
						}	
				if(people.size() == 1){
					decision = false;
					
				}else
					decision = true;
					}
				}
		
				/* If the game starts in Anti-Clockwise Direction */
		public void antiClockWiseDirection(){
			for(int j = 1; decision ; j++){
				for(int i = (j==1 ? (startingPoint-1) : people.size()-1); i >= 0; i--){
			if(skipped <= peopleToBeSkipped){
				if(skipped == peopleToBeSkipped){
					skipped++;
				}
				else{
				System.out.print( people.get(i) + " ");
				skipped++;
				}
			}
			if(skipped > peopleToBeSkipped){
				System.out.print( "\n" + people.get(i) + " is eliminated. \n" );
				people.remove(i);
				skipped = 0;
					}
				}
			if(people.size() == 1){
				decision = false;
			
			}else
				decision = true;
				}
			}
		
				/* 'Game' Method to fulfill main purpose of the program */
		public void gameStarts(){
			displayGreetings();
			if(direction == "clockwise"){
				clockWiseDirection();
			}
			if(direction == "anticlockwise"){
				antiClockWiseDirection();
						}	
			displayGameWinner();
				}
			
			/* Display Greetings */
		public void displayGreetings(){
			System.out.println("				**********You All Are Welcome To********** "
							+"\n				   **********The Josephus Game**********	");
		}
		
			/* Displaying the winner */
		public void displayGameWinner(){
			System.out.println("\n\n			Hhooorrraayyy!!! 				\n\n" +
							   "			   PlAyEr " + people.get(0) + "			\n\n" +
							   "			     Won				");
		}
			/* Initializing the Game */
		public void initialize(){
			fillingArray();
			gameStarts();
			
		}
}
