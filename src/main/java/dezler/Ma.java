package dezler;

public class Ma {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.displayDetails();


        Cars car2 = new Cars();
        car2.color = "blue";
        car2.make = "BMW";
        car2.displayDetails();


        Employee empFirst = new Employee();
        empFirst.name = "Matios";
        empFirst.salary = 10000.0;
        empFirst.displayEmployeeBonus();

        Employee empSecond = new Employee();
        empSecond.name = "Sisilia";
        empSecond.salary = 10600.0;
        empSecond.displayEmployeeBonus();

        Access_Specifier accessSpecifier = new Access_Specifier();
        accessSpecifier.printHello();
    }
}
