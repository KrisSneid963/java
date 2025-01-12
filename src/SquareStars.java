public class SquareStars {

    public static void main(String[] args) {
        int n = 8;

        for (int row = 1; row <= n; row++) {
            // columns
            for (int col = 1; col <= n; col++) {

                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("#  "); //spaces makes more square
                } else {
                    System.out.print("   "); //spaces makes more square
                }
            }

            System.out.println();
        }
    }
}



