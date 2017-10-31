import java.util.*;

class Solution {
    public static int solution(int A[]) {
        // Using ArrayList is much more flexible than using Array
        ArrayList<Integer> arr = new ArrayList<Integer>(A.length);
        for (int i = 0; i < A.length; i++) {
            arr.add(Integer.valueOf(A[i]));
        }

        int ipt = 0;
        int i = 0;

        while (ipt != arr.size()-1) {
            i++;
            if (A[i] == A[ipt]) {
                arr.remove(i);
                arr.remove(ipt);
                i = ipt;
            } else {
                if (i == arr.size() - 1) {
                    ipt +=1;
                    i = ipt;
                }
            }
        }

        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            return -1;
        }
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
        System.out.println("Final Solution: " + sol);
        return;
    }
}
