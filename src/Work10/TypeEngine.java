package Work10;

public class TypeEngine extends TypeCar {
    private String typeEngine;

    public TypeEngine(String mark, String model, int yearOfRelease, String colorCar, String typeCar, String typeEngine) {
        super(mark, model, yearOfRelease, colorCar, typeCar);
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TypeEngine that = (TypeEngine) o;

        return typeEngine != null ? typeEngine.equals(that.typeEngine) : that.typeEngine == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeEngine != null ? typeEngine.hashCode() : 0);
        return result;
    }
}
