class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.modelName);
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            vehicle.updateTyre();
        }
        vehicle.additionalCheck();
    }

    // Перегруженный метод check() для каждого типа транспортного средства(однако в моем решении полиморфизм уже обеспечивает эту функциональность)
    public void check(Car car) {
        check((Vehicle) car);
    }

    public void check(Truck truck) {
        check((Vehicle) truck);
    }

    public void check(Bicycle bicycle) {
        check((Vehicle) bicycle);
    }
}
