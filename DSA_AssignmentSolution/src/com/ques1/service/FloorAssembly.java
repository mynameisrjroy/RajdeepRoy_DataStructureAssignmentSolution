package com.ques1.service;

import java.util.Comparator;
import java.util.LinkedList;

public class FloorAssembly {
	
	public void assemble(int floorCount, LinkedList<Integer> floorSizes) {
		LinkedList<Integer> sortedFloorSizes = (LinkedList<Integer>) floorSizes.clone();
		LinkedList<Integer> tempList =new LinkedList<Integer>();
		
		sortedFloorSizes.sort(Comparator.reverseOrder());
		
		for(int i = 0 ; i < floorCount; i++) {
			tempList.add(floorSizes.get(i));
			tempList.sort(Comparator.reverseOrder());
			
			if(floorSizes.get(i).equals(sortedFloorSizes.getFirst())) {
				System.out.println("Day: "+(i+1)+"");
				for(int j = 0; j < tempList.size() ; j++) {
					if(tempList.get(j).equals(sortedFloorSizes.getFirst())) {
						sortedFloorSizes.remove(0);
						System.out.print(tempList.getFirst()+" ");
						tempList.removeFirst();
						j--;
					}
				}
				System.out.print("\n");
			}else {
				System.out.println("Day: "+(i+1)+"");
				System.out.println("");
			}
		}
		
	}
}
