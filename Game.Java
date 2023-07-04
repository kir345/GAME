//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин. 
//На базе описания персонажей описать простейшую иерархию классов. 
//В основной программе создать по одному экземпляру каждого класса.

import Units;

public class Game{
    
    public static void main(String[] args){
        System.out.println();

        ArrayList<Units> list= new ArrayList<>();

        Crossbowman crossbowman1 = new Crossbowman();
        Warlock warlock1 = new Warlock();
        Monk monk1 = new Monk();
        Sniper sniper1 = new Sniper();
        Spearman spearman1 = new Spearman();
        Peasant peasant1 = new Peasant();
        Rogue rogue1 = new Rogue();


    }
}