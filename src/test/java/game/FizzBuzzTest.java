package src.test.java.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.main.java.game.FizzBuzz;

public class FizzBuzzTest {
	 
	@Test
	public void fizzBuzzSaysFizz() {
		assertEquals(FizzBuzz.gameLogic(3), FizzBuzz.FIZZ);
	}

	@Test
	public void fizzBuzzSaysBuzz() {
		assertEquals(FizzBuzz.gameLogic(5), FizzBuzz.BUZZ);
	}
	
	@Test
	public void fizzBuzzSaysFizzBuzz() {
		assertEquals(FizzBuzz.gameLogic(15), FizzBuzz.FIZZBUZZ);
	}
	
	@Test
	public void fizzBuzzSaysFizzNumber() {
		assertEquals(FizzBuzz.gameLogic(4), "4");
	}
}
