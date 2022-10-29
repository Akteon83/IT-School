public class Fighter extends MilitaryUnit {
    protected int hp = 20;
    protected int damage = 10;
    protected int maneuverability = 5;
    public void strike(Bomber enemy) {
        enemy.hp -= damage;
        if (enemy.getHp() > 0) {
            System.out.println("Enemy bomber hit");
        } else {
            System.out.println("Enemy bomber destroyed");
        }
    }
    public void attack(Fighter enemy) {
        if (maneuverability >= enemy.maneuverability) {
            enemy.hp -= damage;
            System.out.println("We lost");
        } else {
            hp -= enemy.damage;
            System.out.println("We won");
        }
    }
    public int getHp() {
        return hp;
    }
}
