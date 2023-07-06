package units;

public abstract class BaseHero{
    public int health;
    public int defence;
    public int mana;
    public int damage;
    public int actionPoints;
    public int attack;
    public String name;
    public boolean isDead;
    public String state;


//Полный конструктор
    
    public BaseHero(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.damage = damage;
        this.actionPoints = actionPoints;
        this.name = name;
        this.attack = attack;
        this.isDead = false;
        this.state ="Stand";
    }

    public String getName(){
        return name;
    }

    public Object getAttack(){
        return attack;
    }

    public Object getDefense(){
        return defence;
    }

    public Object getDamage(){
        return damage;
    }
    
    public Object getHealth(){
        return health;
    }

    public Object getMana(){
        return mana;
    }

    public Object getActionPoints(){
        return actionPoints;
    }

    public boolean isDead(){
        return isDead;
    } 

    public String getState(){
        return state;
    }

    public String getInfo(){
        return getName();
    }

}