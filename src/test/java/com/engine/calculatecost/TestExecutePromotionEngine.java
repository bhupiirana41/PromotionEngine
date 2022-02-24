package com.engine.calculatecost;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.engine.promotion.CalculatePromotion;


@RunWith(MockitoJUnitRunner.class)
public class TestExecutePromotionEngine {

//	@Mock
	private CalculatePromotion calc;

	private ExecutePomotionEngine testee;

	@Before
	public void setup() {
		calc = Mockito.mock(CalculatePromotion.class);

		testee = new ExecutePomotionEngine(calc);

	}

	@Test
	public void testExecution1() {

		Mockito.when(calc.calculateCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(280);

		int total = testee.runPromotionEngine(3,5,1,1);

		assertThat(total).isEqualTo(280);

	}
	
//	@Test
//	public void testExecution2() {
//
//		Mockito.when(calc.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(100);
//
//		int total = testee.execute(1,1,1,0);
//
//		assertThat(total).isEqualTo(100);
//
//	}
//	
//	@Test
//	public void testExecution3() {
//
//		Mockito.when(calc.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(370);
//
//		int total = testee.execute(5,5,1,0);
//
//		assertThat(total).isEqualTo(370);
//
//	}
//	
//	@Test
//	public void testExecution4() {
//
//		Mockito.when(calc.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(505);
//
//		int total = testee.execute(5,6,5,4);
//
//		assertThat(total).isEqualTo(505);
//
//	}
//	
//	@Test
//	public void testExecution5() {
//
//		Mockito.when(calc.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(750);
//
//		int total = testee.execute(5,5,3,5);
//
//		assertThat(total).isEqualTo(470);
//
//	}


}
