package units;

import java.util.List;

public abstract class BaseHero{
    private int health;
    private int speed;
    private int defense;
    private int mana;
    private int minDamage;
    private int maxDamage;
    private int actionPoints;
    private int attack;
    private String name;
    private boolean isDead;
    private String state;
    public Coordinat coordinat;
    


//Полный конструктор
    
    public BaseHero(int health, int speed, int defense, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        this.health = health;
        this.speed = speed;
        this.defense = defense;
        this.mana = mana;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.actionPoints = actionPoints;
        this.name = name;
        this.attack = attack;
        this.isDead = false;
        this.state ="Stand";
    }

    protected String getName(){
        return name;
    }

    private Object getAttack(){
        return attack;
    }

    private Object getSpeed(){
        return speed;
    }

    private Object getDefense(){
        return defense;
    }

    private Object getDamageMin(){
        return minDamage;
    }

    private Object getDamageMax(){
        return maxDamage;
    }
    
    protected int getHealth(){
        return health;
    }

    public void takeDamge(int damage){
        if(!isDead){
            health -= damage;
            if(health <= 0){
                isDead = true;
                state = "Dead";
            } 
        }
    }

    public void heal(int summa){
        if(!isDead){
            health += summa;
            if (health > 0){
                health = getHealth();
            }
        }
    }

    private Object getMana(){
        return mana;
    }

    public Object getActionPoints(){
        return actionPoints;
    }

    public boolean isDead(){
        return isDead;
    }
    
    public void GetDamage(int damage){
        return;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getShortDescription(){
       return getShortDescription();
    }

    public String getInfo(){
        return getName();
    }


    public BaseHero(String name, int x, int y){
        this.name = name;
        this.coordinat = new Coordinat(x, y);
    }

    protected Coord coord;
    
    protected static class Coord{
        public int x;
        public int y;

        public Coord (int x, int y){
            this.x = x;
            this.y = y;
        }
    
        public int getX(){
            return x;
        }
        
        public void setX(int x){
            this.x = x;
        }

        public int getY(){
            return y;
        }

        public void setY(int y){
            this.y = y;
        }

    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public void step() {
    }

    public int getHp() {
        return 0;
    }

    public void step(List<BaseHero> list1, List<BaseHero> list2) {
    }

    public int[] getCoords() {
        return new int[] {getX(),getY()} ;
    }

}