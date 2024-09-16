class Intern extends Employee {
    int durationInWeeks;

    public Intern(String name, int employeeId, double salary, int durationInWeeks) {
        super(name, employeeId, salary);

        if (durationInWeeks <= 0) {
            throw new IllegalArgumentException("Duration in weeks must be greater than 0.");
        }
        this.durationInWeeks = durationInWeeks;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05 + durationInWeeks * 10;
    }

    // Specific method for Intern
    public void displayDuration() {
        System.out.println("Name: " + name  + ", Position: " + position + ", Internship Duration: " + durationInWeeks + " weeks");
    }
}