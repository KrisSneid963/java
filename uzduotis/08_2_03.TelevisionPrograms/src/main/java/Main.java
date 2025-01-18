
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

//list that stores functional info
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            //add to enter more
            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        System.out.println();

// programs with duration less than or equal to maxDuration
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
//                System.out.println(program);
//both 2 last lines give the same result
            }
        }


    }
}
