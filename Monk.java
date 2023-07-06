package units;

public class Monk extends BaseHero{

    public Monk(int health, int defence, int mana, int damage, int actionPoints, String name) {
        super(health, defence, mana, damage, actionPoints, name, 0);
    }

    public Monk(String name){
        super(5, 7, 1, 4, 11, name, 0);

    }

    public void step(){
        System.out.println("Monk walks...");
    }

    public String getInfo(){
        return "Я Монах";
    }
}
