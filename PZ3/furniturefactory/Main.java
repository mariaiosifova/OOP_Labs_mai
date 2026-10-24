package PZ3.furniturefactory;

import PZ3.furniturefactory.model.ChairType;
import PZ3.furniturefactory.shop.FurnitureShop;
import PZ3.furniturefactory.shop.ModernFurnitureShop;
import PZ3.furniturefactory.shop.VictorianFurnitureShop;
import PZ3.furniturefactory.model.TableType;


public class Main {
    public static void main(String[] args) {
        FurnitureShop victorianShop = new VictorianFurnitureShop();
        System.out.println("Заказ викторианской мебели:");
        victorianShop.orderFurniture(ChairType.ARMCHAIR, TableType.COFFEE);

        FurnitureShop modernShop = new ModernFurnitureShop();
        System.out.println("Заказ современной мебели:");
        modernShop.orderFurniture(ChairType.ORDINARY, TableType.DINING);
    }
}
