package redohomework;

public class Programme25_Overloading {

    int id;
    String name;
    int age;
    // create two arg constructor

    Programme25_Overloading(int i, String n) {
        id = i;
        name = n;
    }
    Programme25_Overloading( int i, String  n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id +  "  " + name + "  "  +age );
    }

    public static void main(String[] args) {

        Programme25_Overloading s1 = new Programme25_Overloading(111, "karan");
        Programme25_Overloading s2 = new Programme25_Overloading(222,"Aryan", 25);
        s1.display();
        s2.display();
    }

}
