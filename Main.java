public class Main{
    public static void main(String[] args) {

        Manager manager = new Manager("Mr.Smith", 101, 90000, 10);
        Engineer engineer = new Engineer("John", 102, 80000, "Java");
        Intern intern = new Intern("Bob", 103, 30000, 12);

         Employee emp1 = manager;  // Upcasting Manager to Employee
        Employee emp2 = engineer; // Upcasting Engineer to Employee
        Employee emp3 = intern;   // Upcasting Intern to Employee

        // Upcasting: Call calculateBonus using the Employee reference
        System.out.println("Employee Info:");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();

        // Downcasting: Accessing specific features of Manager, Engineer, and Intern
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
    }
}
