package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	public SudokuVerifier(){
		
	}

	public int verify(String candidateSolution) {
		
		if(!verifyRule1(candidateSolution))
		{
			return -1;
		}
		if (!verifyRule2(candidateSolution))
		{
			return -2;
		}
		if (!verifyRule3(candidateSolution))
		{
			return -3;
		}
		if (!verifyRule4(candidateSolution))
		{
			return -4;
		}
		return 0;
	}

	public boolean verifyStringLength(String candidateSolution)
	
	{
		int stringLength = 81;
		if (candidateSolution.length() == stringLength)
			return true;
		else
			return false;
			
	}
	public static void checkSubgrid(int row, int col, int[][] n){
		int j = row/3*3;
		int k = col/3*3;
		for(int i=0; i<8; i++){
			if(n[j+i/3][k+i%3]==0){
				continue;
			}
			
		}
	}
	
	/*
	R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
	R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
	R3: A digit can appear only once in the rows of the global grid.
	R4: A digit can appear only once in the columns of the global grid */
	
    private boolean verifyRule1(String candidateSolution) {
		// TODO Auto-generated method stub
    
    	
    	
		return false;
		
	}
	
	@SuppressWarnings("null")
	private boolean verifyRule2(String candidateSolution) {
	int n = 0;
	boolean[] digits = null;
	if (n != 0 && digits[n])
	{
		return false;
	}
	else
	{
		digits[n] = true;
		return true;
	}
		
	}
	private boolean verifyRule3(String candidateSolution) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean verifyRule4(String candidateSolution) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
