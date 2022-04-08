package methodoverriding24;

public class Test2  {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI c = new ICICI();
        AXIS  x = new AXIS();

        System.out.println("SBI Rate of Intreast : "  + s.getRateOfInterest());
        System.out.println("ICICI Rate of Intreast : "  +c.getRateOfInterest());
        System.out.println("AXIS Rate of Interest : "    +x.getRateOfInterest());
    }
}
