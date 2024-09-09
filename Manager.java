public class Manager extends  Employee{

    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize){
      super(name, id, salary);
      this.teamSize = teamSize;
    }
    public double getSalary(){
        return super.getSalary();
    }

    public int getTeamSize(){
        return teamSize;
    }

    @Override
    double calculateBonus() {
        return teamSize * 3500;
    }

    @Override
    public void displayIncome() {
        System.out.print("Manager of " + getTeamSize() + " employees team");
        super.displayIncome();
    }
}
