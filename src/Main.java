public class Main {
    public static void main(String[] args) {
        // Извини за костыли)
        Trinity<Integer> trinity = new Trinity<>(12, 71, 33);
        System.out.println(trinity.getFirst());
        System.out.println(trinity.getSecond());
        System.out.println(trinity.getThird());
        Trinity<String> neo = new Trinity<>("gonna", "give you up", "never");
        System.out.println(neo.getFirst());
        System.out.println(neo.getSecond());
        System.out.println(neo.getThird());
    }
}
