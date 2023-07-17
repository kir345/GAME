package units;
import java.util.List;

public class Crossbowman extends BaseHero{

    private int shots;
    private int minDamage;
    private int maxDamage;
    
    public Crossbowman(int health, int speed, int defense, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        super(health, speed, defense, 0, minDamage, maxDamage, actionPoints, name, attack);
    }

    public Crossbowman(String name) {
        super(10, 4, 3, 0, 2, 3, 14, name, 6);
    }

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
    }

    public int getShots(){
        return shots;
    }

    public int getMinDamage(){
        return minDamage;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2){
        if(getHealth() == 0 || shots == 0){
            return;
        }

        //Поиск ближайшего противника
        BaseHero closestEnemy = null;
        double closestDistance = Double.MAX_VALUE;
        for(BaseHero enemy : getEnemies()){
            double distance = Math.sqrt(Math.pow(enemy.getX() - getX(),2) + Math.pow(enemy.getY() - getY(), 2));
            if(distance < closestDistance){
                closestEnemy = enemy;
                closestDistance = distance;
            }
        }

        // Атака ближайшего противника
        if (closestEnemy != null){
            int damage = (int) Math.round((getMinDamage() + getMaxDamage()) / 2.0);
            closestEnemy.GetDamage(damage);
        }

        // Поиск крестьянина
        Peasant closestFarmer = null;
        closestDistance = Double.MAX_VALUE;
        for (Peasant farmer : getPeasant()){
            double distance = Math.sqrt(Math.pow(farmer.getX() - getX(),2) + Math.pow(farmer.getY() - getY(), 2));
            if (distance < closestDistance){
                closestFarmer = farmer;
                closestDistance = distance;
            }
        }

        // Если нет крестьянина, то уменьшаем запас стрел
        if (closestFarmer == null){
            shots--;
        }
    }

    private BaseHero[] getEnemies() {
        return null;
    }

    private Peasant[] getPeasant() {
        return null;
    }


    //public void step(){
        //System.out.println("Crossbowman walks...");
    //}

    //public String getInfo(){
        //return "Я Арбалетчик Джон";
    //}
  
}
