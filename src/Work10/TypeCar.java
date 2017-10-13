package Work10;

public class TypeCar extends Car {

    private Car car;
    private String typeCar;

    public TypeCar(String mark, String model, int yearOfRelease, String colorCar, String typeCar) {
        super(mark, model, yearOfRelease, colorCar);
        this.typeCar = typeCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeCar typeCar1 = (TypeCar) o;

        if (car != null ? !car.equals(typeCar1.car) : typeCar1.car != null) return false;
        return typeCar != null ? typeCar.equals(typeCar1.typeCar) : typeCar1.typeCar == null;
    }

    @Override
    public int hashCode() {
        int result = car != null ? car.hashCode() : 0;
        result = 31 * result + (typeCar != null ? typeCar.hashCode() : 0);
        return result;
    }
}
