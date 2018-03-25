package com.profitonline.generators;

import java.util.Random;

public class NumberGenerator {
	private final static Random random = new Random(System.currentTimeMillis());
	
	public static String generateVal() {
		double min = 0.0;
		double max = Double.MAX_VALUE;
		return Double.toString((min + (max - min)) * random.nextDouble());
	}
	
	public static String generateVal(int min, int max) {
		return Double.toString((min + (max - min)) * random.nextDouble());
	}
}
