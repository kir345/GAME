package units;

public class Sniper extends BaseHero {
    public Sniper(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Sniper(String name) {
        super(15, 10, 0, 8, 9, name, 12);
    }

    public void step(){
        System.out.println("Snipeer walks...");
    }

    public String getInfo(){
        return "Я Снайпер";
    }
}
