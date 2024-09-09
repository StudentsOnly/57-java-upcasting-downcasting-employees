class Manager extends Employee {
    int teamSize;

        public Manager(String name, int employeeId, double salary, int teamSize) {
            super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1 + teamSize * 100;
    }

    // Specific method for Manager
    public void displayTeamSize() {
        System.out.println("Name: " + name + ", Position: " + position + ", Team Size: " + teamSize);
    }
}