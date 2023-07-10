package units;

public class Warlock extends BaseHero {
    public Warlock(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, mana, damage, actionPoints, name, attack);
    }

    public Warlock(String name) {
        super(25, 12, 1, 5, 13, name, 17);
    }

    public Warlock(String name, int x, int y){
        super(name, x, y);
    }

    public void step(){
        System.out.println("Warlock walks...");
    }

    //public String getInfo(){
        //return "Я Маг";
    //}

}
