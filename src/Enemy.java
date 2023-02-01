public class Enemy {
    protected String name;
    protected int hp;
    protected int dmg;

    public Enemy(String name, int hp, int dmg){
    this.name = name;
    this.hp = hp;
    this.dmg = dmg;
    }
    public boolean alive(){
        return (this.hp > 0);
    }
}