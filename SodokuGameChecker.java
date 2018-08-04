package sodoku;

import java.util.Arrays;
import java.util.Scanner;

public class SodokuGameChecker {
	private final int arraySize = 9; // for 2d-Array size //Board size would be more appropriate name
	private int gameBoard[][] = {{5,3,4,6,7,8,9,1,2},
								 {6,7,2,1,9,5,3,4,8},
								 {1,9,8,3,4,2,5,6,7},
								 {8,5,9,7,6,1,4,2,3},
								 {4,2,6,8,5,3,7,9,1},
								 {7,1,3,9,2,4,8,5,6},
								 {9,6,1,5,3,7,2,8,4},
								 {2,8,7,4,1,9,6,3,5},
								 {3,4,5,2,8,6,1,7,9},
	}; // declaring sudoku game board
	
	//no need to write FALSE down there, the default value is false. This assignment is redundant
	private boolean rowCheck = false;
	private boolean columnCheck = false;
	private boolean blockCheck = false;
	//private boolean blockCheck = false;
	private int frequency[] = new int[9];
	Scanner sc = new Scanner(System.in);
	
	//Constructor
	public SodokuGameChecker(){
		
	}
	
	/*public void initializingArray(){
		for(int i = 0; i < arraySize; i++){
			for(int j = 0; j < arraySize; j++){
				gameBoard[i][j] = sc.nextInt();
			}
		}
	}*/
	
	/* Same logic for both row and column check, why don't you write a function 'check' and pass if you want to check row or column
	 * that would save a lot of effort and code. */
	public void rowChecking(){
		for(int i = 0; i < arraySize; i++){
			Arrays.fill(frequency, 0);
			for(int j = 0; j < arraySize; j++){
					++frequency[(gameBoard[i][j]-1)];
				}
			for(int k = 0; k < frequency.length; k++){
				if(frequency[k] == 1){
					rowCheck = true;
				}
				else {
					rowCheck = false;
					break;
				}
			}
			//if(!rowcheck)
			if(rowCheck == false){
				break;
				}
			}
		}
	
	public void columnChecking(){
		for(int i = 0; i < arraySize; i++){
			Arrays.fill(frequency, 0);
			for(int j = 0; j < arraySize; j++){
					++frequency[(gameBoard[j][i]-1)];
				}
			for(int k = 0; k < frequency.length; k++){
				if(frequency[k] == 1){
					columnCheck = true;
					}
				else {
					columnCheck = false;
					break;
					}
				}
			if(columnCheck == false){
				break;
				}
			}
		}
	
	public void blockChecking(){
		for(int a = 0; a < 9; a += 3){
			for(int b = 0; b < 9; b += 3){		
				Arrays.fill(frequency, 0);
				for(int i = a; i <= (a+2) ; i++){
					for(int j = b; j <= (b+2) ; j++){
					++frequency[(gameBoard[i][j]-1)];
				}
			}
						for(int k = 0; k < frequency.length; k++){
							if(frequency[k] == 1){
								blockCheck = true;
							}
							else {
								blockCheck = false;
								break;
							}
						}
						if(blockCheck == false){
							break;
						}
				}
		}
	}
	
	public void decision(){
		if(columnCheck == true && rowCheck == true && blockCheck == true)
			System.out.println("valid solution. ");
		else
			System.out.println("Invalid solution. ");
	}
	
	
	
	// a better name would be 'initiate'
	public void game(){
		//initializingArray();
		/* Just initiate the board and all here, don't do everything here.
		 * Rather, give functions jo user apni marzi sy use kry. apni marzi sy row, column check kry and all.
		 * You need to design a general solution, jo log apni marzi sy use kr skain to make something new*/
		
		/* It should be noted that no ethically-trained software engineer would ever consent to write a DestroyBaghdad() procedure.
		 * Basic professional ethics would instead require him to write a DestroyCity() procedure, to which Baghdad could be given as a parameter.
		 * I hope you get the point.  */
		rowChecking();
		columnChecking();
		blockChecking();
		decision();
	}
}
