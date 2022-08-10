public class Hero {
    private int health=250;
    private int heroDamage = 30;
    private String typeDefence = "химичиски";

    public Hero(int health) {
        this.health = health;
    }

    public Hero(int health1, String health2) {
        this.heroDamage = health1;
        this.typeDefence = health2;
    }

    public int getHealth() {
        return health;
    }

    public int getHealth1() {
        return heroDamage;
    }

    public String getHealth2() {
        return typeDefence;
    }
}
