public class Gold extends Item {
    private int amt;

    public Gold(int amt){
        super("Gold", String.format("Woah, this is shiny!", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}