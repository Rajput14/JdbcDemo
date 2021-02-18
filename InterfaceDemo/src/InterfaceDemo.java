class InterfaceDemo
   {
       public static void main (String[] args)
         {
// creating an inatance of Bicycle doing some operations
           Bicycle bicycle = new Bicycle();
           bicycle.changeGear(2);
           bicycle.speedUp(3);
           bicycle.applyBrakes(1);
           System.out.println(" present state of bicycle  :");
           bicycle.printStates();
// creating instance of bike.
           Bike bike = new Bike();
           bike.changeGear(1);
           bike.speedUp(4);
           bike.applyBrakes(3);
           System.out.println(" present state of bike :");
           bike.printStates();
       }
  }