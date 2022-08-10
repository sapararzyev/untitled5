public class Boss {
    private int bosshtalth=300;
    private int damage =40;
    private String typeDefence= "atack";

    public Boss(int bosshtalth, int damage, String typeDefence) {
        this.bosshtalth = bosshtalth;
        this.damage = damage;
        this.typeDefence = typeDefence;
    }

    public int getBosshtalth() {
        return bosshtalth;
    }

    public void setBosshtalth(int bosshtalth) {
        this.bosshtalth = bosshtalth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

}
