public class Main {
    public static void main(String[] args) {
        Tank armata = new Tank();
        SAM triumph = new SAM();
        Fighter flanker = new Fighter();
        Bomber swan = new Bomber();
        triumph.strike(flanker);
        armata.strike(triumph);
        swan.strike(armata);
        flanker.strike(swan);
        triumph.strike(flanker);
        armata.beeb();
    }
}
