class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void additionalCheck() {
        System.out.println("Проверяем двигатель");
    }

}
