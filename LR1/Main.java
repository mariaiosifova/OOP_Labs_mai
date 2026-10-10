package LR1;
class Animal {
    private int age;
    private double weight;
    private String name;

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public void eat() { System.out.println("Eating!!!"); }

    public void sleep() { System.out.println("Sleeping..."); }

    public void run() { System.out.println("Running!!!!!"); }



}

class Bird extends Animal{
    private String color;
    private double wingspan;
    private String livingEnvironment;

    public Bird(int age, double weight, String name, String color, double wingspan, String livingEnvironment) {
        super(age, weight, name);
        this.color = color;
        this.wingspan = wingspan;
        this.livingEnvironment = livingEnvironment;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public double getWingspan() { return wingspan; }

    public void setWingspan(double wingspan) { this.wingspan = wingspan; }

    public String getLivingEnvironment() { return livingEnvironment; }

    public void setLivingEnvironment(String livingEnvironment) { this.livingEnvironment = livingEnvironment; }


    public void fly() { System.out.println("--Flying--");}

    public void peck() { System.out.println("--Pecking--"); }

    public void moltingOfFeathers() { System.out.println("Molting..."); }

}

class Owl extends Bird{
    private double headRotation;    
    private String mouseForEatingType;
    private String earsCharacteristic;

    public Owl(int age, double weight, String name, String color, double wingspan, String livingEnvironment,
            double headRotation, String mouseForEatingType, String earsCharacteristic) {
        super(age, weight, name, color, wingspan, livingEnvironment);
        this.headRotation = headRotation;
        this.mouseForEatingType = mouseForEatingType;
        this.earsCharacteristic = earsCharacteristic;
    }

    public double getHeadRotation() { return headRotation; }

    public void setHeadRotation(double headRotation) { this.headRotation = headRotation; }

    public String getMouseForEatingType() { return mouseForEatingType; }

    public void setMouseForEatingType(String mouseForEatingType) { this.mouseForEatingType = mouseForEatingType; }

    public String getEarsCharacteristic() { return earsCharacteristic; }

    public void setEarsCharacteristic(String earsCharacteristic) { this.earsCharacteristic = earsCharacteristic; }

    public void makeSoundOho() { System.out.println("OOhOO"); }

    public void bigRotateHead() { System.out.println("Head rotating..."); }

    public void nightHunting() { System.out.println("Huntiiiing!"); }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(2, 12, "Thomas");
        Bird bird = new Bird(2, 5, "Qwerty", "Brown", 56, "Forest");
        Owl owl = new Owl(67, 52, "Sova", "White", 67, "Sybyr", 134, "MiniMouse", "Torchat");

        System.out.println("ANIMAL");
        animal.eat();
        animal.run();
        animal.sleep();

        System.out.println("BIRD");
        bird.eat();
        bird.run();
        bird.sleep();
        bird.fly();
        bird.moltingOfFeathers();
        bird.peck();

        System.out.println("OWL");
        owl.eat();
        owl.run();
        owl.sleep();
        owl.fly();
        owl.moltingOfFeathers();
        owl.peck();
        owl.bigRotateHead();
        owl.makeSoundOho();
        owl.nightHunting();
    }
}
