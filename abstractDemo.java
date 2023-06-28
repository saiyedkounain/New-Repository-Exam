

abstract class Bike{
    Bike(){ System.out.println("Bike is created!");}
    abstract void run();
    void changeGear(){ System.out.println("Gear Changed");}
}
class KTM extends Bike{
    public void run(){System.out.println("KTM is running");}
}
class Bullet extends Bike{
    public void run(){System.out.println("Bullet is running");}
}

class abstractDemo{
    public static void main(String[] args) {
        Bike K = new KTM();
        System.out.println("Changes");
        Bike B = new Bullet();
        K.run();
        K.changeGear();
        B.run();
        B.changeGear();
    }

}