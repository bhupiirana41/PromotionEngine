package com.engine.promotion;

import com.engine.util.Constant;

public class CalculateSkuA {
	
	//Calculate for SKU A
		public static int calculateSkuIdA(int qunatOfA, int totalA) {
			if (qunatOfA >= 3) {
				int quotient = qunatOfA / 3;
				int remainder = qunatOfA % 3;

				totalA = (quotient >= 0) ? totalA + quotient * Constant.PRICE_COMBO_SKU_A : totalA;

				totalA = (remainder >= 0) ? totalA + remainder * Constant.PRICE_SKU_A : totalA;
			} else {

				totalA = totalA + qunatOfA * Constant.PRICE_SKU_A;
			}
			
			return totalA;
		}
}
