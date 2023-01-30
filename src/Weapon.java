public class Weapon extends Item {
    private int dmg;
    public int getDmg(){ return dmg; }

    public void setDmg(int dmg) { this.dmg = dmg; }
    public Weapon(String name, String desc, int value, int dmg) {
        super(name, desc, value);
        this.dmg = dmg;
    }

    public String str(){
        return String.format("{0}\n-----\n{1}\nValue: {2}\nDmg: {3}",
                this.name, this.desc, this.desc, this.dmg);
    }
}