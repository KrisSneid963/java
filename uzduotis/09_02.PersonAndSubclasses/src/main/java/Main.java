public class Main {
    public static void main(String[] args) {

        System.out.println("==========================");

        Person Taja = new Person("Taja", "J. Baltrusaicio 11 , Vilnius, 06145");
        Person Cile = new Person("Cile", "J. Baltrusaicio 12, Vilnius, 06146");


        System.out.println("Student's name: " + Taja);
        Taja.study();
        System.out.println("Study credits " + Taja.credits());

        System.out.println("==========================");

        System.out.println("Student's name: " + Cile);
        Cile.study(); //credits
        System.out.println("Study credits " + Cile.credits());

        System.out.println("==========================");


        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St.", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Man Helsinki", 5400);

        System.out.println("Teacher's name: " + ada);
        System.out.println("==========================");
        System.out.println("Teacher's name: " + esko);
    }
}
