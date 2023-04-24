class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void additionalCheck() {
        // Нет дополнительных проверок для велосипеда
    }
}
