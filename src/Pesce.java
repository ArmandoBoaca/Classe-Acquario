public class Pesce {
    private String razza;
    private String colore;

    public Pesce(String razza, String colore){
        this.razza = razza;
        this.colore = colore;
    }

    public String getRazza() {
        return razza;
    }

    public String getColore() {
        return colore;
    }

    public Pesce clone(){
        return new Pesce(this.razza, this.colore);
    }
}