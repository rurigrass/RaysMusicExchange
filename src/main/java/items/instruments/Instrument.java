package items.instruments;

import behaviours.IPlay;
import items.Item;

public abstract class Instrument extends Item implements IPlay{

    private String type;
    private String material;
    private String colour;
    private String sound;

    public Instrument (String name, int buyPrice, int sellPrice, String type, String material, String colour, String sound) {
        super(name, buyPrice, sellPrice);
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.sound = sound;
    }

    public String getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getSound() {
        return this.sound;
    }

    public String play() {
        return String.format("This %s makes a %s sound", this.getName(), this.getSound());
    }


}
