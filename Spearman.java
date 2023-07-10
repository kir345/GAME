package units;

public class Spearman extends BaseHero {
    public Spearman(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Spearman(String name) {
        super(5, 5, 0, 3, 7, name, 4);
    }

    public Spearman(String name, int x, int y){
        super(name, x, y);
    }

    public void step(){
        System.out.println("Spearman walks...");
    }

    //public String getInfo(){
        //return "Я Копьеносец" ;
    //}

}
