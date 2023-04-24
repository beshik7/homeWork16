abstract class Vehicle {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    //обьявил абстрактный метод для переопределения в подклассах Vehicle, и в зависимости от типа транспортного средства, будут выполняться различные проверки
    public abstract void additionalCheck();
}
