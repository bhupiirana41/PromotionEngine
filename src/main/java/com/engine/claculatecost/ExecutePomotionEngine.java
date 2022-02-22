package com.engine.claculatecost;

import com.engine.promotion.CalculatePromotion;

public class ExecutePomotionEngine {

	int total;
	private CalculatePromotion calcPromotion;
	public ExecutePomotionEngine() {
		this.total = 0;
		this.calcPromotion = new CalculatePromotion();
	}
	
	public int runPromotionEngine(int skuIdA, int skuIdB, int skuIdC, int skuIdD) {
		return calcPromotion.calculateTotalCost(skuIdA, skuIdB, skuIdC, skuIdD);
	}
	
}
