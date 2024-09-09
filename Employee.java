abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }


    abstract double calculateBonus();

    public void displayIncome(){

        System.out.println(": \n\tbonus = " + String.format("%.2f",calculateBonus()) + "\n\tyearly income = " + String.format("%.2f",calculateBonus() + getSalary()));
    }
}
