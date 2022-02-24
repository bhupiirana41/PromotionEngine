package com.engine.calculatecost;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.engine.promotion.CalculatePromotion;


@RunWith(MockitoJUnitRunner.class)
public class Tests {
ExecutePomotionEngine spy;
//	
//	@Mock
	CalculatePromotion calculatePromotion;
	
	@Before
	public  void setup() {
		calculatePromotion = Mockito.mock(CalculatePromotion.class);
//	/	spy = new ExecutePomotionEngine(calculatePromotion);
	}
	
	@Test
	public void testa() {
		
	}
}
