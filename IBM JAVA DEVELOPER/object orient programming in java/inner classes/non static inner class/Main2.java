class Car{
     private int speed=120;

    // non static inner class automatically stores a reference to its outer object 
    class Engine{
        void show(){
            System.out.println(speed);
        }
    }
}

class Main2{
    public static void main(String[] args){
        Car car=new Car();
        Car.Engine engine=car.new Engine(); // we cannot onlu new Engine(); beacuse java asks which Car should this Engine belong to 
        engine.show();

    }
}