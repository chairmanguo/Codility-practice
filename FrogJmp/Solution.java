import java.util.*;

class Solution {
    public static int solution(int X, int Y, int D) {
        if ((Y-X) % D == 0) {
            return (Y-X) / D;
        } else {
            return (int) ((Y-X) / D) + 1;
        }
    }

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        
        //Decide the number of elements
		System.out.println("Enter initial position X: ");
		int X = Integer.parseInt(scan.nextLine());
        if (X < 0 || X > 1000000000) {
            System.out.println("Input out of bound!");
            return;
        }

        System.out.println("Enter final position Y: ");
		int Y = Integer.parseInt(scan.nextLine());
        if (Y < 0 || Y > 1000000000 || Y < X) {
            System.out.println("Input out of bound or less than X!");
            return;
        }

        System.out.println("Enter step D: ");
		int D = Integer.parseInt(scan.nextLine());
        if (D < 0 || D > 1000000000) {
            System.out.println("Input out of bound!");
            return;
        }

        int sol = solution(X, Y, D);
        System.out.println("Final solution is: " + sol);
        return;
    }
}