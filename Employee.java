abstract class Employee {
    String name;
    int employeeId;
    double salary;
    String position;

       public Employee(String name, int employeeId, double salary) {
           if (name == null || name.trim().isEmpty()) {
               throw new IllegalArgumentException("Name cannot be null or empty.");
           }
           if (employeeId <= 0) {
               throw new IllegalArgumentException("Employee ID must be positive.");
           }
           if (salary < 0) {
               throw new IllegalArgumentException("Salary cannot be negative.");
           }
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