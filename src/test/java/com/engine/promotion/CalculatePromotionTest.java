package com.engine.promotion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CalculatePromotionTest {
	
	@InjectMocks
	CalculatePromotion testee;
	
	
	@Test
	public void testCalculation1() {
		int result = testee.calculateCost(5,5,1,0);
		
		assertThat(result).isEqualTo(370);
	}
	
	@Test
	public void testCalculation2() {
		int result = testee.calculateCost(5,6,5,4);
		
		assertThat(result).isEqualTo(505);
	}
	
	@Test
	public void testCalculation3() {
		int result = testee.calculateCost(3,5,1,1);
		
		assertThat(result).isEqualTo(280);
	}
	
	@Test
	public void testCalculation4() {
		int result = testee.calculateCost(1,1,1,0);
		
		assertThat(result).isEqualTo(100);
	}
	
	@Test
	public void testCalculation5() {
		int result = testee.calculateCost(5,5,3,5);
		
		assertThat(result).isEqualTo(470);
	}
}
