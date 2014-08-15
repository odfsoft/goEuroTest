package testQuando;

import java.util.*;


public class BetterProgrammerTask {

	
    public static double getProbability(int Y, int X) {    	
    	int sides = 6;  
    	int numDie = 2;  
    	int[][] showDice = new int[sides][numDie];  
    	   
    	for (int i = 0; i < sides; i++)  
    	{  
    	    for (int j = 0; j < numDie; j++)  
    	    {  
    	        showDice[i][j] = i;  
    	    }  
    	} 
    	return 0;
    }
	
	
    public static boolean isPalindrome(String s) {
    	String reverse = "";
    	for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		}
    	if(reverse.equals(s)){
    		return true;
    	}else{
    		return false;
    	}    	
    }
    
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }
    
    
    public static int getLevelSum(Node root, int N) {
        int sum = 0;
        if (N == 0) {
            if (root != null) {
                return root.getValue();
            } else {
                return 0;
            }    
        }
         
        for (int i = 0; i < root.getChildren().size(); i++) {
        	Node node = root.getChildren().get(i);
        	sum += getLevelSum(node, N-1);
		}   
        
        return sum;
    }
    
    public static int getRequiredNumberOfBits(int N) {
      return (int) (Math.log(N)/Math.log(2))+1;
    }
	
    public static int getSumOfTwoClosestToZeroElements(int[] a) {
        if(a.length<2){
        	System.out.println("the array has to have at least two values");
        }
    	int min1=a[0];
        int min2=a[1];
    	
    	for (int i = 0; i < a.length; i++) {
			if(Math.abs(min1)>Math.abs(a[i])){
				min1=a[i];
			}else if(Math.abs(min1)==Math.abs(a[i]) && ){
				
			} else if(Math.abs(min2)>Math.abs(a[i])){
				min2=a[i];
			}
		}
        return a1+a2;        
    }
}
