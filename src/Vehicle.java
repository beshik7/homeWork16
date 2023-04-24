abstract class Vehicle {
    protected String modelName;
    protected int wheelsCount;

    public abstract void updateTyre();

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
    //исправил реализацию методов через интерфейс
    interface Checkable {
    void additionalCheck();
}
