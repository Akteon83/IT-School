public abstract class MilitaryUnit {
    protected int hp;
    protected int damage;
    public void strike(MilitaryUnit enemy) {
        enemy.hp -= damage;
    }
    public int getHp() {
        return hp;
    }
}
