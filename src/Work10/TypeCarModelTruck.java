package Work10;

public class TypeCarModelTruck extends Car {
    private String modelTruck;

    public TypeCarModelTruck(String mark, String model, int yearOfRelease, String colorCar, String modelTruck) {
        super(mark, model, yearOfRelease, colorCar);
        this.modelTruck = modelTruck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeCarModelTruck that = (TypeCarModelTruck) o;

        return modelTruck != null ? modelTruck.equals(that.modelTruck) : that.modelTruck == null;
    }

    @Override
    public int hashCode() {
        return modelTruck != null ? modelTruck.hashCode() : 0;
    }
}
