package PZ3.furniturefactory.model;

public class VictorianTable implements Table {
    private final String name;

    public VictorianTable(String name) {
        this.name = name;
    }

    @Override
    public void craft() {
        System.out.println("Мастерим массивный викторианский " + name + " с изогнутыми ножками");
    }

    @Override
    public void pack() {
        System.out.println("Покрываем стол защитным воском и упаковываем в деревянный ящик");
    }
}
