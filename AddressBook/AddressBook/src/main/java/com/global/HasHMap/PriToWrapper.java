package com.global.HasHMap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PriToWrapper {

	public static void main(String[] args) {
		 List<String> aList = Arrays.asList("Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks", "GFG");

     // Converting to set using stream
     Set<String> set = aList.stream().collect(Collectors.toSet());
 
     for(String s : set) {
    	 System.out.print(s+" ");
    	 
     }
		
	}

}
