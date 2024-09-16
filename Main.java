public class Main {
    public static void main(String[] args) {
        try {
            // Create instances of Manager, Engineer, and Intern
            Manager manager = new Manager("Mr. Smith", 101, 90000, 10);
            Engineer engineer = new Engineer("John", 102, 80000, "Java");
            Intern intern = new Intern("Bob", 103, 30000, 12);

            // Upcasting: Treating specific types as Employee
            Employee emp1 = manager;  // Upcasting Manager to Employee
            Employee emp2 = engineer; // Upcasting Engineer to Employee
            Employee emp3 = intern;   // Upcasting Intern to Employee

            // Display employee information
            System.out.println("Employee Info:");
            emp1.displayInfo();
            emp2.displayInfo();
            emp3.displayInfo();

            // Downcasting: Accessing specific features of Manager, Engineer, and Intern
            try {
                if (emp1 instanceof Manager) {
                    Manager specificManager = (Manager) emp1;
                    specificManager.displayTeamSize();
                }

                if (emp2 instanceof Engineer) {
                    Engineer specificEngineer = (Engineer) emp2;
                    specificEngineer.displayProgrammingLanguage();
                }

                if (emp3 instanceof Intern) {
                    Intern specificIntern = (Intern) emp3;
                    specificIntern.displayDuration();
                }
            } catch (ClassCastException e) {
                System.err.println("Error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
