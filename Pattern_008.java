public class Pattern_008 {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++){
            // for preceeding trail
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            // for printing star
            for (int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }

            // for succeeding trail
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
