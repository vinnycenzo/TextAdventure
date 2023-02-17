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

        Zombie slowZombie = new Zombie(2);

        Zombie fastZombie = new Zombie(5);

        Dog spotdog = new Dog(false);

        GiantSpider giantSpider = new GiantSpider(16);

        Skeleton cursedSkeleton = new Skeleton(10);

        Player player1 = new Player("Vinny", (short)1000, (short)10, true);
        if (player1.getLife())
            System.out.println("Player 1 is alive.");
        else
            System.out.println("Player 1 is not alive.");

        Player player2 = new Player("Noob", (short)100, (short) 2, true);
        System.out.println(player2.getLife());
    }
}