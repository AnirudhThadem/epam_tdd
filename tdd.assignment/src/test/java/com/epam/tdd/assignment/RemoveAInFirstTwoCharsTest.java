package com.epam.tdd.assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAInFirstTwoCharsTest {

	/* To Do List
	 * 1.  "ABCD"  =>  "BCD"
	 * 2.  "AACD"  =>  "CD"
	 * 3   "BACD" =>  "BCD"
	 * 4   "BBAA" =>   "BBAA"
	 * 5   "AABAA" =>  "BAA"
	 * 6    "A"   =>   ""
	 * 
	 */
    RemoveAInFirstTwoChars removeAInFirstTwoChars ;
  	
	@BeforeEach
	void setup() {
		removeAInFirstTwoChars = new RemoveAInFirstTwoChars();
	}
	
	@Test
	void testFirst1A() {
		assertEquals("BCD", removeAInFirstTwoChars.remove("ABCD"));	
	}
	
		@Test
		void testFirst2A() {
			assertEquals("CD", removeAInFirstTwoChars.remove("AACD"));	
			
			assertEquals("BAA", removeAInFirstTwoChars.remove("AABAA"));
			
			assertEquals("", removeAInFirstTwoChars.remove("AA"));
			
		}
		
		@Test
		void testSecond1A() {
			
			assertEquals("BCD", removeAInFirstTwoChars.remove("BACD"));
		}
		
		@Test
		void testFirstNoA() {
			assertEquals("BBAA", removeAInFirstTwoChars.remove("BBAA"));
		}
		
		@Test
		void testSingleA() {
			assertEquals("", removeAInFirstTwoChars.remove("A"));
		}
		
		@Test
		void testNullString() {
			assertEquals("", removeAInFirstTwoChars.remove(""));
		}

}
