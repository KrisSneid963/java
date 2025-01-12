public class MultiplicationTable {

    public static void main(String[] args) {
        int size = 9; // 9 rows

        // top
        System.out.println("Multiplication Table");
        System.out.print("       ");
        for (int table = 1; table <= size; table++) {
            System.out.print(table + "   ");
        }
        System.out.println();

        // horizontal
        System.out.print("    ");
        for (int line = 1; line <= size; line++) {
            System.out.print("_-_-");

        }

        System.out.println();

        // multiplication of first row
        for (int row = 1; row <= size; row++) {

            System.out.print(row + " | "); // 1 = 1|

            //  multiplication in rows
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", row * j); //add 4 normal spaces
            }
            System.out.println();
        }
    }
}
