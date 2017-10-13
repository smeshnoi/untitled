package Work10;

public class Motorcycle extends Car {
    private int engineCapacity;

    public Motorcycle(String mark, String model, int yearOfRelease, String colorCar, int engineCapacity) {
        super(mark, model, yearOfRelease, colorCar);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        return engineCapacity == that.engineCapacity;
    }

    @Override
    public int hashCode() {
        return engineCapacity;
    }
}
