public class Main {
    public static void main(String[] args) {
        Boss boss =new Boss(400,40,"atack");
        System.out.println("тип зашиты босса " + boss.  getTypeDefence());
        System.out.println("урон босса " + boss.   getDamage());
        System.out.println("здоровье босса " + boss. getBosshtalth());

    }

}