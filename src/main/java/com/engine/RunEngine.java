package com.engine;

import java.util.Scanner;

import com.engine.claculatecost.ExecutePomotionEngine;

/**
 * Hello world!
 *
 */
public class RunEngine 
{
    public static void main( String[] args )
    {
    	
    	ExecutePomotionEngine engine = new ExecutePomotionEngine();
    	
    	Scanner sc = new Scanner(System.in);


		System.out.println("Enter quantity value of SKUID A");
		int skuIdA = sc.nextInt();

		System.out.println("Enter quantity value of SKUID B");

		int skuIdB = sc.nextInt();

		System.out.println("Enter quantity value of SKUID C");

		int skuIdC = sc.nextInt();

		System.out.println("Enter quantity value of SKUID D");

		int skuIdD = sc.nextInt();
		
		int total = engine.runPromotionEngine(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" ######### Total Calculated Cost ==== >>> " + total);
    }
}
