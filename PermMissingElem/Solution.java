import java.util.*;

class Solution {
    public static int solution(int A[]) {
        int size = A.length + 1;
        long ref = size*(size+1)/2;
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return (int) (ref - sum);
    }

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        
        //Decide the number of elements
		System.out.println("Enter how many elements: ");
		int N = Integer.parseInt(scan.nextLine());
        if (N < 1 || N > 1000000) {
            System.out.println("Input out of bound!");
            return;
        }

        //Create a integer array
		int[] inputArray = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the " + (i+1) + " integer : ");
		    inputArray[i] = Integer.parseInt(scan.nextLine());

            if (inputArray[i] < 1 || inputArray[i] > 1000000000) {
                System.out.println("Input out of bound!");
                return;
            }
        }
        System.out.println("Input Array is: " + Arrays.toString(inputArray));
        
        int sol = solution(inputArray);
        System.out.println("The missing number is: " + sol);
        return;
    }
}