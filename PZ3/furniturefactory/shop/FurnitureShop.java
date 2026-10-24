package PZ3.furniturefactory.shop;

import PZ3.furniturefactory.model.Chair;
import PZ3.furniturefactory.model.ChairType;
import PZ3.furniturefactory.model.Table;
import PZ3.furniturefactory.model.TableType;

public abstract class FurnitureShop {
    protected abstract Chair createChair(ChairType type);
    protected abstract Table createTable(TableType type);

    public void orderFurniture(ChairType chairType, TableType tableType) {
        System.out.println("=== Начало сборки комплекта мебели ===");
        
        Chair chair = createChair(chairType);
        chair.craft();
        chair.pack();
        
        System.out.println("---");
        
        Table table = createTable(tableType);
        table.craft();
        table.pack();
        
        System.out.println("=== Комплект мебели полностью готов ===\n");
    }
}
