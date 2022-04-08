package methodoverriding;

public class Bike2 {
    public void run () {// defining the same method as parent class
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();// calling method
    }
}
