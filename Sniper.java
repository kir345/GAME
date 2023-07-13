package units;

import java.util.List;

public class Sniper extends BaseHero {
    public Sniper(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, defence, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Sniper(String name) {
        super(15, 10, 0, 8, 10, 9, name, 12);
    }

    public Sniper(String name, int x, int y){
        super(name, x, y);
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if (!isDead()){
            setState("Stand");
        }
    }

    //public void step(){
        //System.out.println("Snipeer walks...");
    //}

    //public String getInfo(){
        //return "Я Снайпер";
    //}
}
