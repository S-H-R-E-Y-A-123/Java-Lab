public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am a redhead Duck");
    }
}
