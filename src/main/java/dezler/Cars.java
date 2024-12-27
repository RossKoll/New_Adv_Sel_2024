package dezler;

public class Cars {

    String color = "White";
    String make = "Honda";
    String type = "SUV";

    public void displayDetails(){
        System.out.println(String.format("I have %s %s of color %s", make, type,color ));
    }
}
