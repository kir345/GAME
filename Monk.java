package units;

import java.util.List;

public class Monk extends BaseHero{

    public Monk(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, defence, mana, minDamage, maxDamage, actionPoints, name, 0);
    }

    public Monk(String name){
        super(5, 7, 1, 4, 4, 11, name, 0);

    }

    public Monk(String name, int x, int y){
        super(name, x, y);
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if (!isDead()){
            setState("Stand");
        }
    }

    //public void step(){
        //System.out.println("Monk walks...");
    //}

    //public String getInfo(){
        //return "Я Монах";
    //}
}
