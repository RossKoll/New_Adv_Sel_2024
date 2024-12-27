package dezler;

public class Methods {

    public static void main(String[] args) {

        Methods m = new Methods();
        m.doThis();

        m.addition(10, 20);

        int mult = m.multiply(5,3);
        System.out.println(mult);
        System.out.println(m.multiply(5,5));

    }



    public void doThis(){
        System.out.println("Just do it");
    }

    public void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

}
