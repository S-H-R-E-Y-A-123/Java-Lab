public class Main {
    public static void main(String[] args){

        MallardDuck md = new MallardDuck();
        System.out.println("-------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-------------");

        RubberDuck rb = new RubberDuck();
        System.out.println("-------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("-------------");

        RedheadDuck rh = new RedheadDuck();
        System.out.println("-----------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("------------");
    }
}
