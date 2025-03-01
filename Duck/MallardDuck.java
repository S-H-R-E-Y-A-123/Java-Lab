public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack(); //implementing quack hebiour
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a mallard duck.");
    }
}
