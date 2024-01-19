
import kz.aitu.dz.Cta;

public class Main {
    public static void main(String[] args) {
        Cta Ventilator = new Cta("ventilator", 5, "Blue");
        System.out.println("The cat is " + Ventilator.getAge() + " years old");
        System.out.println("The cat is " + Ventilator.getColor());
        Ventilator.lay();
    }
}
