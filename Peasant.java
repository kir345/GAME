package units;

public class Peasant extends BaseHero {
    public Peasant(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Peasant(String name) {
        super(1, 1, 0, 1, 8, name, 1);
    }

    public void step(){
        System.out.println("Peasant walks...");
    }

    public String getInfo(){
        return "Я Крестьянин";
    }
}
