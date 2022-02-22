package com.engine.promotion;

import com.engine.util.Constant;

public class CalculateSkuB {
	
	//Calculate for SKU B
	public static int calculateSkuIdB(int qunatOfB, int totalB) {
		if (qunatOfB >= 2) {
			int quotient = qunatOfB / 2;
			int remainder = qunatOfB % 2;

			totalB = (quotient >= 0) ? totalB + quotient * Constant.PRICE_PROMO_SKU_B : totalB;

			totalB = (remainder >= 0) ? totalB + remainder * Constant.PRICE_SKU_B : totalB;
		} else {

			totalB = totalB + qunatOfB * Constant.PRICE_SKU_B;
		}
		
		return totalB;
	}
}
