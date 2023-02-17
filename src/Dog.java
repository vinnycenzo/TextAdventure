public class Dog extends Enemy {
    boolean isAngry = false;
    public Dog(boolean angry){ super("Dog", 10, 5);
    }
    boolean angry(){
        if (hp < 10)
            isAngry = true;
        else
            isAngry = false;
            System.out.println("The dog is angry.");
            return isAngry;
    }
}