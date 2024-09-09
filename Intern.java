public class Intern extends Employee{
    private int durationInWeeks;
    static String companyName = "BMS";

    public Intern(String name, int id, double salary, int durationInWeeks){
        super(name, id, salary);
        this.durationInWeeks = durationInWeeks;
    }

    public int getDurationInWeeks(){
        return durationInWeeks;
    }

    @Override
    double calculateBonus() {

        return durationInWeeks <= 12 ? 3600 : 6000;

    }

    @Override
    public void displayIncome() {
        System.out.print("Intern (" + getDurationInWeeks() + " weeks)");
        super.displayIncome();
    }
}
