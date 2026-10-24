package PZ3.furniturefactory.shop;

import PZ3.furniturefactory.model.*;

public class ModernFurnitureShop extends FurnitureShop {
    @Override
    protected Chair createChair(ChairType type) {
        if (type == ChairType.ORDINARY) {
            return new ModernChair("пластиковый стул");
        } else {
            return new ModernChair("геймерское кресло");
        }
    }

    @Override
    protected Table createTable(TableType type) {
        if (type == TableType.DINING) {
            return new ModernTable("офисный стол");
        } else {
            return new ModernTable("минималистичный кофейный столик");
        }
    }
}
