public class SAM extends MilitaryUnit {
    protected int hp = 30;
    protected int damage = 15;
    void strike(Fighter enemy) {
        enemy.hp -= damage;
        if (enemy.hp > 0) {
            System.out.println("Aircraft hit");
        } else {
            System.out.println("Aircraft destroyed");
        }
    }
    public int getHp() {
        return hp;
    }
}
