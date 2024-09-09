public class Engineer extends Employee{
    private String programmingLanguage;

    public Engineer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus() {

        switch(programmingLanguage){
            case "C++":
                return 10000;
            case "Java":
                return 9000;
            case "Python":
                return 9100;
            case "C#":
                return 8500;
            default:
                return 2000;
        }

    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    @Override
    public void displayIncome() {
        System.out.print("Engineer " + getProgrammingLanguage());
        super.displayIncome();

    }
}
