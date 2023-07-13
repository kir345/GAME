package units;

import java.util.List;

public class Spearman extends BaseHero {
    public Spearman(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, defence, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Spearman(String name) {
        super(5, 5, 0, 1, 3, 7, name, 4);
    }

    public Spearman(String name, int x, int y){
        super(name, x, y);
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
