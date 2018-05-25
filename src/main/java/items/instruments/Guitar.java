package items.instruments;

public class Guitar extends Instrument {

    private int stringNumber;

    public Guitar (String name, int buyPrice, int sellPrice, String type, String material, String colour, String sound, int stringNumber) {
        super(name, buyPrice, sellPrice, type, material, colour, sound);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return this.stringNumber;
    }
}
