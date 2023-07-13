package units;

import java.util.List;

public class Peasant extends BaseHero {
    public Peasant(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, defence, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Peasant(String name) {
        super(1, 1, 0, 1, 1, 8, name, 1);
    }

    public Peasant(String name, int x, int y){
        super(name, x, y);
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
