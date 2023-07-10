
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import units.BaseHero;
import units.Crossbowman;
import units.Monk;
import units.Names;
import units.Peasant;
import units.Rogue;
import units.Sniper;
import units.Spearman;
import units.Warlock;


public class Main{
    
    public static void main(String[] args) {

        List<BaseHero> list1 = new ArrayList<>();
        List<BaseHero> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            int hero1 = random.nextInt(4);
            int hero2 = random.nextInt(4);
            switch(hero1){
                case 0:
                    list1.add(new Peasant(getName(), getX(), getY() ));
                    break;
                case 1:
                    list1.add(new Rogue(getName(), getX(), getY() ));
                    break;
                case 2:
                    list1.add(new Sniper(getName(), getX(), getY() ));
                    break;
                case 3:
                    list1.add(new Warlock(getName(), getX(), getY() ));
                    break;
            }
            switch(hero2){
                case 4: 
                    list2.add(new Peasant(getName(), getX(), getY() ));
                    break;
                case 5:
                    list2.add(new Spearman(getName(), getX(), getY() ));
                    break;
                case 6:
                    list2.add(new Crossbowman(getName(), getX(), getY() ));
                    break;
                case 7:
                    list2.add(new Monk(getName(), getX(), getY() ));
                    break;
            }

            Peasant peasant = new Peasant("Noah", 10, 20);
            System.out.println(peasant);

            //System.out.println(list1);
            //System.out.println(list2);
        
            //list1.forEach(n -> System.out.println(n.getInfo()));
            //list2.forEach(n -> System.out.println(n.getInfo()));

        }
    

        //public String getName(){
            //return Names.values()[new Random().nextInt(Names.values().length)].toString();
        //}

        List<BaseHero>allHeroes = new ArrayList<>();
        allHeroes.addAll(list1);
        allHeroes.addAll(list2);

        for(BaseHero hero: allHeroes){
            System.out.println(hero.getInfo());
        }
        Peasant peasant = new Peasant("Noah", 10, 20);
    

    for(int i = 1; i<= 10; i++){
        System.out.println("Round " + ":");

        for (BaseHero c: allHeroes){
            //c.step();
            System.out.println(c.getName() + getX() + getY());
        }
        System.out.println();
    }
}
    
    public static int getY() {
        return 0;
    }

    public static int getX() {
        return 0;
    }

    public static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}



        

