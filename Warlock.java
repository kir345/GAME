package units;

import java.util.List;

public class Warlock extends BaseHero {
    public Warlock(int health, int speed, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, speed, defence, mana, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Warlock(String name) {
        super(25, 9, 12, 1, 5, 5, 13, name, 17);
    }

    public Warlock(String name, int x, int y){
        super(name, x, y);
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if (!isDead()){
            setState("Stand");
        }
    }

    //public void step(){
        //System.out.println("Warlock walks...");
    //}

    //public String getInfo(){
        //return "Я Маг";
    //}

}
