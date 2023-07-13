package units;

import java.util.List;

public class Rogue extends BaseHero {
    public Rogue(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, defence, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Rogue(String name) {
        super(10, 3, 0, 2, 4, 10, name, 8);
    }

    public Rogue(String name, int x, int y){
        super(name, x, y);
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if (!isDead()){
            setState("Stand");
        }
    }

    //public void step(){
        //System.out.println("Rogue walks...");
    //}

    //public String getInfo(){
        //return "Я Разбойник";
    //}
}
