public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2011);
        System.out.println("Friday of the examined week is: " + date);

        // Advance by 7 days for each week
        date.advance(7);
        System.out.println("Friday after 1 week is: " + date);

        date.advance(7);
        System.out.println("Friday after 2 weeks is: " + date);

        date.advance(7);
        System.out.println("Friday after 3 weeks is: " + date);

        date.advance(7);
        System.out.println("Friday after 4 weeks is: " + date);


        SimpleDate newDate = date.afterNumberOfDays(790);
        System.out.println("The date after 790 days from the examined Friday is: " + newDate);

        System.out.println("\n--------\n");

        // Create a new date and calculate one week ahead
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now.afterNumberOfDays(7); //after how many days

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek); // the new date
    }
}
