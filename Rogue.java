package units;

public class Rogue extends BaseHero {
    public Rogue(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Rogue(String name) {
        super(10, 3, 0, 3, 10, name, 8);
    }

    public Rogue(String name, int x, int y){
        super(name, x, y);
    }

    public void step(){
        System.out.println("Rogue walks...");
    }

    //public String getInfo(){
        //return "Я Разбойник";
    //}
}
