 class Truck extends Vehicle {
     public Truck(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }

     @Override
     public void additionalCheck() {
         System.out.println("Проверяем двигатель");
         System.out.println("Проверяем прицеп");
     }

}
