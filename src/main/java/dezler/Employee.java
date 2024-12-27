package dezler;

public class Employee {

    String name;
    int id;
    Double salary;

    public void displayEmployeeBonus(){
        System.out.println(String.format("Bonus salary of %s is : " + salary * 0.2, name));
    }


}
