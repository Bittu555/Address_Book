package com.global.HasHMap;

public class MAx {
	
	 public static int findMax(int arr[]){  
	        int max=arr[0];//arr[0] instead of 0  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
	 
	 public static int cube(int n){  
	        return n*n*n;  
	    }  

}
