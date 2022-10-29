public class Tank extends MilitaryUnit {
    protected int hp = 40;
    protected int damage = 25;
    protected int speed = 5;
    public void strike(SAM enemy) {
        enemy.hp -= damage;
        if (enemy.getHp() > 0) {
            System.out.println("SAM site hit");
        } else {
            System.out.println("SAM site destroyed");
        }
    }
    public void attack(Tank enemy) {
        if (speed >= enemy.speed) {
            enemy.hp -= damage;
            System.out.println("We won");
        } else {
            hp -= enemy.damage;
            System.out.println("We lost");
        }
    }
    public int getHp() {
        return hp;
    }
    public void beeb() {
        System.out.println("beeb");
    }
}
