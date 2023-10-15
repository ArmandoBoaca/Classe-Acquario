public class Main {
    public static void main(String[] args){

        // TEST CLASSE PESCE
        Pesce p1 = new Pesce("Sogliola", "Nero");
        System.out.println(p1.getRazza());
        System.out.println(p1.getColore());
        System.out.println(p1.toString());
        Pesce p2 = p1.clone();
        System.out.println(p1.getRazza());
        System.out.println(p1.getColore());
        System.out.println(p2.toStringInner());
        Pesce p3 = new Pesce("Trota","Azzurro");
        Pesce p4 = new Pesce("Salmone","Arancione");
        Pesce p5 = new Pesce("Tonno","Grigio");
        System.out.println("\n");
        Pesce[] arr = {p1,p2,p3,p4,p5};
        Acquario a1 = new Acquario("Genova", arr);
        System.out.println(a1.toString());

    }
}
