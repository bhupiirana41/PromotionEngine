package com.engine.promotion;

public class CalculatePromotion {
	
	public int calculateCost(int quantOfA, int quantOfB, int quantOfC, int quantOfD ) {
		
		  int totalCost =0;
		  totalCost = CalculateSkuA.calculateSkuIdA(quantOfA, totalCost);
		  totalCost = CalculateSkuB.calculateSkuIdB(quantOfB, totalCost);
		  totalCost = CalculateSkuCandD.calculateSkuIdCAndD(quantOfC, quantOfD, totalCost);
		
		return totalCost ;
	}
	
	


	
	
	

	
}
