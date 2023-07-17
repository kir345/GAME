package units;

import java.util.List;

public class Spearman extends BaseHero {

    private int health;
    private int speed;
    private int defense;
    private int mana;
    private int attack;

    public Spearman(int health, int speed, int defense, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, speed, defense, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Spearman(String name) {
        super(10, 4, 5, 0, 1, 3, 7, name, 4);
    }

    public Spearman(String name, int x, int y){
        super(name, x, y);
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
        //System.out.println("Spearman walks...");
    //}

    //public String getInfo(){
        //return "Я Копьеносец" ;
    //}

}
