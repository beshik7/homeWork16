class Car extends Vehicle implements Checkable {
    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void additionalCheck() {
        System.out.println("Проверяем двигатель");
    }
}
