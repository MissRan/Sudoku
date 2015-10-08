
package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "";
		int result = verifier.verify(candidateSolution);
		assertTure(result == -2 || result == -3);
		
	}

}
