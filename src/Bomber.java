public class Bomber extends MilitaryUnit {
    protected int hp = 40;
    protected int damage = 20;
    public void strike(Tank enemy) {
        enemy.hp -= damage;
        if (enemy.getHp() > 0) {
            System.out.println("Tank hit");
        } else {
            System.out.println("Tank destroyed");
        }
    }
    public int getHp() {
        return hp;
    }
}
