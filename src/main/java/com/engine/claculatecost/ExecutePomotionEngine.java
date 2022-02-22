package com.engine.claculatecost;

import com.engine.promotion.CalculatePromotion;

public class ExecutePomotionEngine {

	private CalculatePromotion calcPromotion;
	
	public ExecutePomotionEngine(CalculatePromotion calcPromotion) {
		this.calcPromotion = calcPromotion;
	}
	
	public int runPromotionEngine(int skuIdA, int skuIdB, int skuIdC, int skuIdD) {
		return calcPromotion.calculateCost(skuIdA, skuIdB, skuIdC, skuIdD);
	}
	
}
