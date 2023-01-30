public class Arrow extends Weapon {

    private int amt;
    public Arrow(int amt) {
        super("Arrow",  String.format("Woah, this is pointy!", String.valueOf(amt)), amt, 10);
    }
}