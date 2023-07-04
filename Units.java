package units;

public abstract class Units {
    
    public int health;
    public int defence;
    public int mana;
    public int damage;
    public int actionPoints;
    public int initiave;
    public String name;

    //Полный конструктор

    public Units(int health, int defence, int mana, int damage, int actionPoints, String name, int initiave) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.name = name;
        this.initiave = initiave;
    }


   

}
