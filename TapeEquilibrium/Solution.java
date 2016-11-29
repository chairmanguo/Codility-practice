import java.util.*;

class Solution {
    public static int solution(int[] A) {
        int sol = -1;
        for (int i=1; i<A.length; i++) {
            long left = 0;
            long right = 0;
            for (int j=0; j<i; j++) {
                left += A[j];
            }
            for (int k=i; k<A.length; k++) {
                right += A[k];
            }
            long diff = Math.abs(right-left);
            if (sol == -1 || diff < sol) {
                sol = (int) diff;
            }
        }
        return sol;
    }

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        
        //Decide the number of elements
		System.out.println("Enter how many elements: ");
		int N = Integer.parseInt(scan.nextLine());
        if (N < 2 || N > 100000) {
            System.out.println("Input out of bound!");
            return;
        }

        //Create a integer array
		int[] inputArray = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the " + (i+1) + " integer : ");
		    inputArray[i] = Integer.parseInt(scan.nextLine());

            if (inputArray[i] < -1000 || inputArray[i] > 1000) {
                System.out.println("Input out of bound!");
                return;
            }
        }
        System.out.println("Input Array is: " + Arrays.toString(inputArray));
        
        int sol = solution(inputArray);
        System.out.println("The final answer is: " + sol);
        return;
    }
}