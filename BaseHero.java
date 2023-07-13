package units;

public abstract class BaseHero{
    public int health;
    public int defence;
    public int mana;
    public int minDamage;
    public int maxDamage;
    public int actionPoints;
    public int attack;
    public String name;
    public boolean isDead;
    public String state;
    public Coordinat coordinat;


//Полный конструктор
    
    public BaseHero(int health, int defence, int mana, int minDamage, int maxDamage, int actionPoints, String name, int attack) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.actionPoints = actionPoints;
        this.name = name;
        this.attack = attack;
        this.isDead = false;
        this.state ="Stand";
    }

    public String getName(){
        return name;
    }

    public Object getAttack(){
        return attack;
    }

    public Object getDefense(){
        return defence;
    }

    public Object getDamageMin(){
        return minDamage;
    }

    public Object getDamageMax(){
        return maxDamage;
    }
    
    public int getHealth(){
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

    public Object getMana(){
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


}