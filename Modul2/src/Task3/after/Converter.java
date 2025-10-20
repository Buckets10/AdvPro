package Task3.after;

public abstract class Converter {
    public double value;
    public String unitType;

    public Converter(double value, String type) {
        this.value = value;
        this.unitType = type;
    }
}
