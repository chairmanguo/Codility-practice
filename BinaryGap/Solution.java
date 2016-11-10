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

    public static int solution(int N) {
        int sol = 0;
        int temp = 0;

        String sBinary = Integer.toBinaryString(N);
        for (int i = 0; i < sBinary.length(); i++) {
            if (sBinary.charAt(i) == '0') {
                temp += 1;
            } else {
                if (temp > sol) sol = temp;
                temp = 0;
            }
        }

        return sol;
    }

    public static void main( String[] args ) {
        System.out.println(args);

        if (args.length != 1 || !isInteger(args[0])) {
            System.out.println("Please specify one integer as input.\n Now quit.");
            return;
        }
        
        int sol = solution(Integer.parseInt(args[0]));
        System.out.println("The binary gap is: " + sol);
        return;
    }
}