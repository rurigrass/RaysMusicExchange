import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Acoustic Guitar", 50, 100, "String Instrument", "Wood", "Wood", "Pluck Pluck", 6);
    }

    @Test
    public void  canGetName() {
        assertEquals("Acoustic Guitar", guitar.getName());
    }

     @Test
    public void  canGetBuyPrice() {
        assertEquals(50, guitar.getBuyPrice());
    }

     @Test
    public void  canGetSellPrice() {
        assertEquals(100, guitar.getSellPrice());
    }

     @Test
    public void  canGetType() {
        assertEquals("String Instrument", guitar.getType());
    }

     @Test
    public void  canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

     @Test
    public void  canGetColour() {
        assertEquals("Wood", guitar.getColour());
    }

     @Test
    public void  canGetSound() {
        assertEquals("Pluck Pluck", guitar.getSound());
    }

     @Test
    public void  canGetStringNumber() {
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void canGetIPlay() {
        assertEquals("This Acoustic Guitar makes a Pluck Pluck sound", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(50, guitar.calculateMarkup());
    }


}
