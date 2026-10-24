package PZ3.furniturefactory.shop;

import PZ3.furniturefactory.model.*;

public class VictorianFurnitureShop extends FurnitureShop {
    @Override
    protected Chair createChair(ChairType type) {
        if (type == ChairType.ORDINARY) {
            return new VictorianChair("резной стул");
        } else {
            return new VictorianChair("мягкое кресло");
        }
    }

    @Override
    protected Table createTable(TableType type) {
        if (type == TableType.DINING) {
            return new VictorianTable("обеденный стол");
        } else {
            return new VictorianTable("журнальный столик");
        }
    }
}
