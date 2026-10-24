package PZ3.furniturefactory.model;

public class ModernTable implements Table {
    private final String name;

    public ModernTable(String name) {
        this.name = name;
    }

    @Override
    public void craft() {
        System.out.println("Собираем современный " + name + " со стеклянной столешницей");
    }

    @Override
    public void pack() {
        System.out.println("Защищаем стекло пенопластом и упаковываем в картон");
    }
}
