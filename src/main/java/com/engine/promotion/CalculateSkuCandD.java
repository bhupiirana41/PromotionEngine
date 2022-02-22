package com.engine.promotion;

import com.engine.util.Constant;

public class CalculateSkuCandD {

	// Calculate for SKU C
	public static int calculateSkuIdCAndD(int qunatOfC, int qunatOfD, int totalCD) {

		if (qunatOfC >= 1 && qunatOfD >= 1) {

			totalCD = (qunatOfC == qunatOfD) ? totalCD + qunatOfC * Constant.PRICE_COMBO_SKU_C_D : totalCD;

			totalCD = (qunatOfC > qunatOfD)
					? totalCD + (qunatOfD * Constant.PRICE_COMBO_SKU_C_D + (qunatOfC - qunatOfD) * Constant.PRICE_SKU_C)
					: totalCD;

			totalCD = (qunatOfD > qunatOfC)
					? totalCD + (qunatOfC * Constant.PRICE_COMBO_SKU_C_D + (qunatOfD - qunatOfC) * Constant.PRICE_SKU_D)
					: totalCD;

		} else {
			totalCD = totalCD + qunatOfC * Constant.PRICE_SKU_C;

			totalCD = totalCD + qunatOfD * Constant.PRICE_SKU_D;
		}
		return totalCD;
	}
}
