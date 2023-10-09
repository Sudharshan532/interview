package com.java;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println("Using random method: "+(int)(Math.random()*10));
		System.out.println();
		
		Random random = new Random();
		System.out.println("Using Random Class: "+random.nextInt(50));
		System.out.println("Using Random Class: "+random.nextInt(100));
		System.out.println("Using Random Class: "+random.nextInt(150));
		System.out.println(" ------- Long -------- ");
		System.out.println("Using Random Class: "+random.nextLong());
		System.out.println(" ------- Float -------- ");
		System.out.println("Using Random Class: "+random.nextFloat());
		System.out.println(" ------- Double -------- ");
		System.out.println("Using Random Class: "+random.nextDouble());
		System.out.println(" ------- Boolean -------- ");
		System.out.println("Using Random Class: "+random.nextBoolean());
		
		System.out.println();
		System.out.println(" ------- ThreadLocalRandom class -------");
		System.out.println("Using Thread: "+ ThreadLocalRandom.current().nextInt(2989));
		System.out.println("Using Thread: "+ ThreadLocalRandom.current().nextDouble(2989));
		System.out.println("Using Thread: "+ ThreadLocalRandom.current().nextBoolean());
		
	}
}
