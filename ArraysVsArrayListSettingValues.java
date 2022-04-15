package com.personal.codeprep;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVsArrayListSettingValues {

	public static void main(String args[]) {
		
		
		String[] arrayOfStrings = {"Application", "Booting","Cherry-Pick","Deployment","ECS Registry"};
		arrayOfStrings[1]= "Bomberman";
		System.out.println(arrayOfStrings[1]);
		
		ArrayList<String> arrayListOfStrings = new ArrayList<>(Arrays.asList(
			"Application", "Booting","Cherry-Pick","Deployment","ECS Registry"));
		arrayListOfStrings.set(2, "CompleteApplicationDevelopment");
		System.out.println(arrayListOfStrings.get(2));

		
	}
}
