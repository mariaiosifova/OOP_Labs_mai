package PZ3.furniturefactory.model;

public class ModernChair implements Chair {
    private final String name;

    public ModernChair(String name) {
        this.name = name;
    }

    @Override
    public void craft() {
        System.out.println("Отливаем современный " + name + " из эко-пластика и алюминия");
    }

    @Override
    public void pack() {
        System.out.println("Упаковываем стул в плоскую коробку");
    }
}
