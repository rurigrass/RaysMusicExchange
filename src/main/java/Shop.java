import items.Item;
import items.instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private ArrayList <Item> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addItemToStock(Item item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(Item item) {
        this.stock.remove(item);
    }
}
