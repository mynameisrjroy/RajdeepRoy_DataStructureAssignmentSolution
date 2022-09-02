package com.ques1.main;

import java.util.Scanner;

import com.ques1.service.FloorAssembly;

import java.util.LinkedList;


public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FloorAssembly fa = new FloorAssembly();
		
		System.out.println("Enter the total no of floors in the building ");
		int floorCount = sc.nextInt();
		LinkedList<Integer> floorSizes  = new LinkedList<>();

		
		for(int i = 1; i <= floorCount; i++) {
			System.out.println("Enter the floor size given on day : " + i);	
			int size = sc.nextInt();
			floorSizes.add(size);
		}
		
		System.out.println("The order of construction is as follows");
		fa.assemble(floorCount, floorSizes);
		
		sc.close();
	}

}