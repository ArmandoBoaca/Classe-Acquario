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
        for (int i = 0; i < capAcquario; i++) {
            this.arrPesci[i] = null;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getRazzaPesceI(int i){
        return this.arrPesci[i].getRazza();
    }

    public String getColorePesceI(int i){
        return this.arrPesci[i].getColore();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}