class Bicycle extends Vehicle implements Checkable {
    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void additionalCheck() {
        // Велосипед не требует дополнительных проверок
    }
}
