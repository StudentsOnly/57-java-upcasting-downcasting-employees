class Engineer extends Employee {
    String programmingLanguage;

      public Engineer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    // Specific method for Engineer
    public void displayProgrammingLanguage() {
        System.out.println("Name: " + name + ", Position: " + position + ", Programming Language: " + programmingLanguage);
    }
}