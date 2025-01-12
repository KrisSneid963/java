public class WeeksAndDaysLoops {

    public static void main(String[] args) {

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("  Day " + day);
            }

            System.out.println();
        }
    }

}