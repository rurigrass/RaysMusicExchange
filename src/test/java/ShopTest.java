import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Acoustic Guitar", 50, 100, "String Instrument", "Wood", "Wood", "Pluck Pluck", 6);
    }

    @Test
    public void canCountStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.countStock());
    }


}
