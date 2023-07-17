package units;

import java.util.List;

public class Peasant extends BaseHero {

    private int health;
    private int speed;
    private int defense;
    private int mana;
    private int attack;

    public Peasant(int health, int speed, int defense, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, speed, defense, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Peasant(String name) {
        super(1, 3, 1, 0, 1, 1, 8, name, 1);
    }

    public Peasant(String name, int x, int y){
        super(name, x, y);
    }

    
    public void attack(BaseHero hero){
        System.out.println("Peasant " + getName() + "attaks " + hero.getName());
    }

  
    public void move(int deltaX, int deltaY){
        System.out.println("Farmer " + getName() + " moves to (" + (coord.getX() + deltaX) + ", " + (coord.getY() + deltaY) + ")");
        coord.setX(coord.getX() + deltaX);
        coord.setY(coord.getY() + deltaY);
    }

    public int getAttack(){
        return attack;
    }

    public int getHealth(){
        return health;
    }

    public int getSpeed(){
        return speed;
    }

    public int getDefense(){
        return defense;
    }

    public int getMana(){
        return mana;
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if (!isDead()){
            setState("Stand");
        }
    }

    //public void step(){
        //System.out.println("Peasant walks...");
    //}

    //public String getInfo(){
        //return "Я Крестьянин";
    //}
}
