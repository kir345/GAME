package units;


import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Program {

    public static List<BaseHero> list1 = new ArrayList<>();
    
    public static List<BaseHero> list2 = new ArrayList<>();

    public static List<BaseHero> allList = new ArrayList<>();
    
    
    
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            int hero1 = random.nextInt(4);
            int hero2 = random.nextInt(4) + 4;
            switch(hero1){
                case 0:
                    list1.add(new Peasant(getName() + i));
                    break;
                case 1:
                    list1.add(new Rogue(getName() + i));
                    break;
                case 2:
                    list1.add(new Sniper(getName() + i));
                    break;
                case 3:
                    list1.add(new Warlock(getName() + i));
                    break;
            }
            switch(hero2){
                case 4: 
                    list2.add(new Peasant(getName() + i));
                    break;
                case 5:
                    list2.add(new Spearman(getName() + i));
                    break;
                case 6:
                    list2.add(new Crossbowman(getName() + i ));
                    break;
                case 7:
                    list2.add(new Monk(getName() + i));
                    break;
            }
        }

        allList.addAll(list1);
        allList.addAll(list2);
        //allList.sort((o1, o2) -> extracted(o1, o2));

        Scanner in = new Scanner(System.in);
        while (true){
                
                View.view();
                in.nextLine();
                for (BaseHero hero : allList){
                    if (list2.contains(hero)){
                        hero.step(list1, list2);
                    }else hero.step(list2,list1);
                }
                if(isListDie(list1)){
                    System.out.println("List 2 (Blue) win");
                    break;
                }
                if(isListDie(list1)){
                    System.out.println("List 1 (Green) win");
                    break;
                }
            }
        
        List<BaseHero>allHeroes = new ArrayList<>();
        allHeroes.addAll(list1);
        allHeroes.addAll(list2);

        //Collections.sort(allHeroes, (h1, h2) -> ((Peasant) h2).getSpeed() - ((Peasant) h1).getSpeed());

        for(BaseHero hero: allHeroes){
            System.out.println(hero.getInfo());
        }
        Peasant farmer = new Peasant("Noah", 10, 20);
    
    for(int i = 1; i <= 10; i++){
        System.out.println("Round " + i + ":");

        for (BaseHero c: allHeroes){
            c.step();
            System.out.println(c.getName() + " is " + c.getState() + " with " + c.getHealth() + " health.");
        }
        System.out.println();
    }
}


    public static int getY(){
        return 0;
    }

    public static int getX() {
        return 0;
    }

    private static boolean isListDie(List<BaseHero> list12) {
        return false;
    }

    public static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    //Peasant peasant = new Peasant("Noah", 10, 20);
    //System.out.println(peasant);

    //System.out.println(list1);
    //System.out.println(list2);
        
    //list1.forEach(n -> System.out.println(n.getInfo()));
    //list2.forEach(n -> System.out.println(n.getInfo()));
    

}



        

