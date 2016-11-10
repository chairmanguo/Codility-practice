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

    public static int[] solution(int A[], int N, int K) {
        int[] sol = A.clone();
        int temp = -1;

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    temp = sol[N-1];
                } else {
                    sol[N - j] = sol[N - j - 1];
                }
            }
            sol[0] = temp;
        }

        return sol;
    }

    public static void main( String[] args ) {
        int[] sol;
        int[] inputArray;
        int K;
        Scanner scan = new Scanner(System.in);
        
        //Decide the number of elements
		System.out.println("Enter how many elements: ");
		int N = Integer.parseInt(scan.nextLine());
        if (N < 0 || N > 100) {
            System.out.println("Input out of bound!");
            return;
        }

        //Create a integer array
		inputArray = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the " + (i+1) + " integer : ");
		    inputArray[i] = Integer.parseInt(scan.nextLine());
            if (inputArray[i] < -1000 || inputArray[i] > 1000) {
                System.out.println("Input out of bound!");
                return;
            }
        }

        //Decide the time of rotations
		System.out.println("Enter how many rotations: ");
		K = Integer.parseInt(scan.nextLine());
        if (K < 0 || K > 100) {
            System.out.println("Input out of bound!");
            return;
        }

        sol = solution(inputArray, N, K);
        System.out.println(Arrays.toString(sol));
        return;
    }
}