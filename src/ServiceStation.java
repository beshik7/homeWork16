class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        if (vehicle instanceof Checkable) {
            ((Checkable) vehicle).additionalCheck();
        }
    }
    //добавил перегруженные методы check() для каждого типа наследника Vehicle
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