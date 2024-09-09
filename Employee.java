abstract class Employee {
    String name;
    int employeeId;
    double salary;
    String position;

       public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.position = this.getClass().getName();
    }

     public abstract double calculateBonus();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId + ", Position: " + position + ", Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus() + "\n");
    }
}