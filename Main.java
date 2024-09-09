public class Main{
    public static void main(String[] args) {

        Employee manager = new Manager("John", 1212, 72000, 5); //Upcasting
        Employee engineer = new Engineer("Sandra", 1313, 60000, "C#"); //Upcasting
        Employee intern = new Intern("Lin", 1414, 32000, 11); //Upcasting

        manager.displayIncome();
        engineer.displayIncome();
        intern.displayIncome();

        Intern intern1 = (Intern)intern;    //Downcasting

        System.out.println("Intern works in '" + intern1.companyName + "'");


    }


}
