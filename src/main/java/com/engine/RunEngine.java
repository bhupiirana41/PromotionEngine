package com.engine;

import com.engine.claculatecost.ExecutePomotionEngine;
import com.engine.promotion.CalculatePromotion;

public class RunEngine 
{
    public static void main( String[] args )
    {
    	CalculatePromotion calculatePromoton = new CalculatePromotion();
    	
    	ExecutePomotionEngine engine = new ExecutePomotionEngine(calculatePromoton);
		
		int skuIdA = 1;

		int skuIdB = 1;
		
		int skuIdC = 1;

		int skuIdD = 0;
		
		int total = engine.runPromotionEngine(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" Total Calculated Cost case 1:  " + total);
		
		//Case 2
		
		
		 skuIdA = 5;

		 skuIdB = 5;
		
		 skuIdC = 1;

		 skuIdD = 0;
		
		 total = engine.runPromotionEngine(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" Total Calculated Cost case 2:  " + total);
		
		
		//Case 3
		
		 skuIdA = 3;

		 skuIdB = 5;
		
		 skuIdC = 1;

		 skuIdD = 1;
		
		 total = engine.runPromotionEngine(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" Total Calculated Cost case 3:  " + total);
    }
}
