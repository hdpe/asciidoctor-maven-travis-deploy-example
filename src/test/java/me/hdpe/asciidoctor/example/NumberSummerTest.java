package me.hdpe.asciidoctor.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NumberSummerTest {
	
	private NumberSummer summer;
	
	@BeforeEach
	void setUp() {
		summer = new NumberSummer();
	}
	
	@Test
	void sumSumsNumbers() {
		int result = summer.sum(1, 2);
		
		assertThat(result, is(3));
	}
}
