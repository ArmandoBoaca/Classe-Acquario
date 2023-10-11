public class Main {
    public static void main(String[] args){
        Pesce p1 = new Pesce("Sogliola", "Nero");
        System.out.println(p1.toString());
        Pesce p2 = p1.clone();
        System.out.println(p2.toStringInner());

    }
}
