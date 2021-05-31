package factory_pattern;

/**
 * VehicleSuperClass
 */
public abstract class VehicleSuperClass {

    public abstract int getTyres();
    public abstract String getType();

    @Override
    public String toString() {
        return this.getTyres() + " " + this.getType();
    }

}