package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClosestNumbers {
	
	private int size;
	private List<Long> elements = new ArrayList<Long>();
	private Map<Long, List<String>> smallestPairs = new HashMap<Long, List<String>>();

	public void readInput(){
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		for(int i=0; i< size; i++){
			elements.add(scanner.nextLong());
		}
		scanner.close();
	}
	
	public void calculate(){
		Collections.sort(elements);
		long smallestDistance = elements.get(1) - elements.get(0);
		List<String> pairs =new ArrayList<String>();
		pairs.add(elements.get(0).toString() + " , "+ elements.get(1));
		smallestPairs.put(smallestDistance, pairs);
		for(int i=2; i< elements.size(); i++){
			long newDistance = elements.get(i) - elements.get(i-1);
			if(newDistance < smallestDistance){
				smallestPairs = new HashMap<Long, List<String>>();
				smallestDistance = newDistance;
				pairs =new ArrayList<String>();
				pairs.add(elements.get(i-1).toString() + " , "+ elements.get(i));
				smallestPairs.put(smallestDistance, pairs);
			}else if(newDistance == smallestDistance){
				smallestPairs.get(smallestDistance).add(elements.get(i-1).toString() + " , "+ elements.get(i));
			}
			
		}
	}
	
	
	
	public static void main(String[] args){
		ClosestNumbers closet = new ClosestNumbers();
		closet.readInput();
		closet.calculate();
		System.out.println(closet.elements);
		System.out.println(closet.smallestPairs);
	}
}
