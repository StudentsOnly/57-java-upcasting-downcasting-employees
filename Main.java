import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Manager("Alf", "1001", 5000.0, 5),
                new Engineer("Selena", "1002", 3500.0, "Java"),
                new Intern("Bob", "1003", 2000, 4)
        ));

        employees.forEach(em -> System.out.println(em.getClass().getSimpleName() + " " + em.getName() +
                " earns Bonus: $%.2f".formatted(em.calculateBonus())));

        System.out.println("-".repeat(90));

        employees.forEach(em -> printSubclassAttribute(em));
    }

    private static void printSubclassAttribute(Employee employee) {
        if (employee instanceof Manager) {
            Manager manager = Manager.class.cast(employee);
            System.out.println("Manager " + manager.getName() + "'s Team size: " + manager.getTeamSize());
        } else if (employee instanceof Engineer) {
            Engineer engineer = Engineer.class.cast(employee);
            System.out.println("Engineer " + engineer.getName() +
                    "'s Programing language: " + engineer.getProgrammingLanguage());
        } else if (employee instanceof Intern) {
            Intern intern = Intern.class.cast(employee);
            System.out.println("Intern " + intern.getName() +
                    "'s Duration in Weeks: " + intern.getDurationInWeeks());
        }
    }
}
