import java.util.*;

class Solution {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }

        return true;
    }

    public static int solution(int A[]) {
    }

    public static void main( String[] args ) {
        int[] sol;
        int[] inputArray;
        Scanner scan = new Scanner(System.in);
        
        //Decide the number of elements
		System.out.println("Enter how many elements: ");
		int N = Integer.parseInt(scan.nextLine());
        if (N < 1 || N > 1000000) {
            System.out.println("Input out of bound!");
            return;
        }

        //Create a integer array
		inputArray = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the " + (i+1) + " integer : ");
		    inputArray[i] = Integer.parseInt(scan.nextLine());
            if (inputArray[i] < 1 || inputArray[i] > 1000000000) {
                System.out.println("Input out of bound!");
                return;
            }
        }

        sol = solution(inputArray);
        System.out.println("Final Solution:" + sol);
        return;
    }
}