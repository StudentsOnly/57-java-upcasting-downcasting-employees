public class Intern extends Employee {

private int durationInWeeks;

    public Intern(String name, String employeeId, double salary, int durationInWeeks) {
        super(name, employeeId, salary);
        this.durationInWeeks = durationInWeeks;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * getDurationInWeeks() / 4;
    }
}
