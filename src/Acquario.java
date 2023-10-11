public class Acquario {
    private String nome;
    private Pesce[] arrPesci;

    public Acquario(String nome, Pesce[] arrPesci){
        this.nome = nome;
        this.arrPesci = new Pesce[arrPesci.length];
        for (int i = 0; i < arrPesci.length; i++) {
            this.arrPesci[i] = arrPesci[i].clone();
        }
    }

    public Acquario(String nome, int capAcquario){
        this.nome = nome;
        this.arrPesci = new Pesce[capAcquario];
    }
}