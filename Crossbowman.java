package units;

public class Crossbowman extends BaseHero{
    
    public Crossbowman(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Crossbowman(String name) {
        super(5, 3, 0, 3, 14, name, 6);
    }

    public void step(){
        System.out.println("Crossbowman walks...");
    }

    public String getInfo(){
        return "Я Арбалетчик Джон";
    }
  
}
