public class ClockMinHour {

    public static void main(String[] args) {
        //outer hours
        for (int hour = 0; hour < 24; hour++) {
            //inner min
            for (int minute = 0; minute < 60; minute++) {

                System.out.println(
                        (hour < 10 ? "0" + hour : hour) + ":" +
                                (minute < 10 ? "0" + minute : minute)
                );
            }
        }
        //if h <10 true, so 0 + hour = 0.5, if false adding numbers like egz: 53
    }
}