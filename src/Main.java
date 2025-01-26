import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankEmployees> employees = BankEmployees.selectEmployee();

        for (BankEmployees employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: $" + employee.getSalary());


            employee.performDuties();

            
            LocalDate meetingDate = LocalDate.now(); // Use the current date
            employee.attendMeeting("Annual Review", meetingDate);

            System.out.println();
        }
    }
}
