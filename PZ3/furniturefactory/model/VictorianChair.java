package PZ3.furniturefactory.model;

public class VictorianChair implements Chair {
    private final String name;

    public VictorianChair(String name) {
        this.name = name;
    }

    @Override
    public void craft() {
        System.out.println("Вырезаем викторианский " + name + " из дуба с ручной резьбой");
    }

    @Override
    public void pack() {
        System.out.println("Оборачиваем стул в мягкий бархат");
    }
}
