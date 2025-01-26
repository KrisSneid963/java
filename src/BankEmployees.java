import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankEmployees implements EmployeesActivities {

    private String name;
    private int age;
    private double salary;

    public BankEmployees(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static List<BankEmployees> selectEmployee() {
        return new ArrayList<>(List.of(
                new BankEmployees("Alina", 25, 1500.00),
                new BankEmployees("Tomas", 35, 2000.00)
        ));
    }

    @Override
    public void performDuties() {
        if ("Alina".equalsIgnoreCase(name)) {
            System.out.println(name + " is programming.");
        } else if ("Tomas".equalsIgnoreCase(name)) {
            System.out.println(name + " is making projects.");
        } else {
            System.out.println(name + " is performing general duties.");
        }
    }

    @Override
    public void attendMeeting(String topic, LocalDate date) {
        System.out.println(name + " is attending a meeting on: " + topic + " (Date: " + date + ")");
    }
}
