package units;

//import java.util.ArrayList;

public class Crossbowman extends BaseHero{

    //private int shots;
    
    public Crossbowman(int health, int defence, int mana, int damage, int actionPoints, String name, int attack) {
        super(health, defence, 0, damage, actionPoints, name, attack);
    }

    public Crossbowman(String name) {
        super(5, 3, 0, 3, 14, name, 6);
    }

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
    }

    
    //public void step(ArrayList<BaseHero> list1, ArrayList<BaseHero> list2){
        //if(getHealth() == 0 || shots == 0){
            //return;
        //}
    //}

    //public void step(){
        //System.out.println("Crossbowman walks...");
    //}

    //public String getInfo(){
        //return "Я Арбалетчик Джон";
    //}
  
}
