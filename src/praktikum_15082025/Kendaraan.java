
package praktikum_15082025;

public class Kendaraan {
    protected int jmlRoda;
    protected String warna;
    
    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }
    public int getJmlRoda() {
        return jmlRoda;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
    public void hasil() {
        System.out.println("Jumlah Roda : " +jmlRoda);
        System.out.println("Warna Kendaraan : " +warna);
    }
}
