public class Player {
    String name;
    boolean life = true;  //true or false
    short hp = 200;
    short dmg = 0;

    public Player(String name, short hp, short dmg, boolean life) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.life = life;
    }

    public Player(String name, short hp, boolean life){
        this.name = name;
        this.hp = hp;
        this.life = life;

        }
        boolean getLife(){
        if (hp <= 0)
            life = false;
        else
            life = true;
            return life;
        }
    }