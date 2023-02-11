public class Main {
    protected String name;
    protected String desc;
    protected int value;
    public Main() {
        this.name = name;
        this.desc = desc;
        this.value = value;
    }
    public static void main(String[] args) {

        Gold goldBar = new Gold(10);

        Sword magicSword = new Sword();

        Pillow softPillow = new Pillow();

        Mace bigMace = new Mace();

        Ogre greenOgre = new Ogre("Green");

        Ogre redOgre = new Ogre("Red");

        Zombie slowZombie = new Zombie(5);

        Zombie fastZombie = new Zombie(10);

        Dog spotdog = new Dog(false);

        GiantSpider giantSpider = new GiantSpider(10);

        Skeleton cursedSkeleton = new Skeleton(10);
    }
}