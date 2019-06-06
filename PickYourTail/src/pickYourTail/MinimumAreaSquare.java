package pickYourTail;

import java.util.Scanner;

public class MinimumAreaSquare {
	static int minimumAreaFromPoints(int xArray[],int yArray[], int k) {
		// Find maximum y and minimum y value
		int maxVal = Integer.MIN_VALUE;
	    for(int i : yArray){
	        if(i > maxVal){
	            maxVal = i;
	        }
	    }
	    int minVal = Integer.MAX_VALUE;
	    for(int i : xArray){
	        if(i < minVal){
	            minVal = i;
	        }
	    }
	    int yLength = (maxVal-minVal)+2;
	    // Find maximum x and minimum x value
	    maxVal = Integer.MIN_VALUE;
	    for(int i : xArray){
	        if(i > maxVal){
	            maxVal = i;
	        }
	    }
	    minVal = Integer.MAX_VALUE;
	    for(int i : xArray){
	        if(i < minVal){
	            minVal = i;
	        }
	    }
	    int xLength = (maxVal-minVal)+2;
	    int sqSide = (yLength > xLength)?yLength:xLength;
	    return sqSide*sqSide;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xSize = sc.nextInt();
		int xArray[] = new int[xSize];
		for(int i=0 ; i < xSize; i++) {
			xArray[i] = sc.nextInt();
		}
		int ySize = sc.nextInt();
		int yArray[] = new int[ySize];
		for(int i=0 ; i < ySize; i++) {
			yArray[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int minArea = minimumAreaFromPoints(xArray,yArray,k);
		System.out.println(minArea);
	}

}
