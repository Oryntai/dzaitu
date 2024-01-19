package kz.aitu.dz;

public class Cta {
    private String name;
    private int age;
    private String color;

    public Cta(String name, int age, String color) {
        if (name == null || color == null) {
            throw new IllegalArgumentException("Name and color must not be null");
        }
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        System.out.println("Age geter was called");
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative");
        }
        System.out.println("Setter for age was called");
        this.age = age;
    }

    public String getColor() {
        System.out.println("Color Geter was called");
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("Color shouldnt not be null");
        }
        System.out.println("Color seter was called");
        this.color = color;
    }

    public void lay() {
        System.out.println(name + " has laid on you!");
    }
}
